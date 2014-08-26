(ns qbits.pod.test.core-test
  (:use clojure.test)
  (:require [qbits.pod :as pod]))

(deftest test-fix-me
  (let [p  (pod/pod 1)]
    (is (= 1 @p))
    (is (= 2 (pod/reset! p 2)))
    (is (= 3 (pod/setf! p #(inc %))))
    (is (= 6 (pod/swap! p (fn [o x y] (+ o x y)) 1 2)))
    (is (= 7 (pod/swap! p inc)))))
