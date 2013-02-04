
(ns problems.lists
  (:refer-clojure :exclude [==])
  (:use clojure.core.logic))

; 1.01

(defne my-lasto
  [xs x]
  ([[a . ()] _] (== a x))
  ([[_ . a] _]
    (my-lasto a x)))

