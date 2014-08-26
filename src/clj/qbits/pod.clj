(ns qbits.pod
  (:refer-clojure :exclude [reset! swap!]))

(defprotocol PPod
  (reset! [this x])
  (setf! [this f]))

(deftype Pod [^:volatile-mutable val]
  PPod
  (reset! [this x]
    (set! val x))

  (setf! [this f]
    (set! val (f val)))

  clojure.lang.IDeref
  (deref [this]
    val))

(defmacro swap!
  [p f & args]
  `(reset! ~p (~f (deref ~p) ~@args)))

(defn pod [x] (Pod. x))

(defmethod print-method Pod [p ^java.io.Writer w]
  (.write w (str "<< " @p " >>")))
