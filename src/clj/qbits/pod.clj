(ns qbits.pod
  (:refer-clojure :exclude [reset!]))

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

(defn pod
  [x]
  (Pod. x))
