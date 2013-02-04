
(ns problems.lists
  (:refer-clojure :exclude [==])
  (:use clojure.core.logic))

; 1.01 - Last element of a list

(defne my-lasto
  [xs x]
  ([[a . ()] _] (== a x))
  ([[_ . a] _]
    (my-lasto a x)))

; 1.02 - Last but one element of a list

(defne my-lastbutoneo
  [xs x]
  ([[a . [_ . ()]] _]
   (== a x))
  ([[_ . a] _]
   (my-lastbutoneo a x)))

