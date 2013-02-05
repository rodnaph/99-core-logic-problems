
(ns problems.lists
  (:refer-clojure :exclude [==])
  (:use clojure.core.logic))

; 1.01

(defne my-lasto
  "Relation where x is the last element of xs"
  [xs x]
  ([[a . ()] _] (== a x))
  ([[_ . a] _]
    (my-lasto a x)))

; 1.02

(defne my-lastbutoneo
  "Relation where x is the last but one element of a list"
  [xs x]
  ([[a . [_ . ()]] _]
   (== a x))
  ([[_ . a] _]
   (my-lastbutoneo a x)))

; 1.03 - todo

(run 1 [q]
  (my-kth [1 2 3] 1 q))

(defne my-kth
  "Relation where x is the k'th element of a list"
  [xs k x]
  ([[a . _] 0 _] (== a x))
  [[[_ . a] b _] (my-kth (dec b) x)])

; 1.04

(defne my-reverseo
  "Relation where ys is the reverse of xs"
  [xs ys]
  ([[a . ()] _] (conso a () ys))
  ([[a . b] _]
    (fresh [c d]
      (conso a () c)
      (my-reverseo b d)
      (appendo d c ys))))

; 1.05

(defn my-palindrome
  "Relation which succeeds if xs is a palindrome"
  [xs z]
  (conde
    ((my-reverseo xs xs) (== z s#))))

; 1.07 - todo

(defne my-listo
  "Relation where xs is a list"
  [xs x]
  ([() _] (== x s#))
  ([[a . b] _]
   (fresh [c]
     (my-listo b x))))

(run 1 [q]
  (my-flatteno [1 [2] 2 3] q))

(defne my-flatteno
  "Relation where ys is a flattened xs"
  [xs ys]
  ([() _] (== ys ()))
  ([[a . b] _]
    (== b ())
    (conso a () ys))
  ([[a . b] _]
    (fresh [d e f]
      (my-listo a f)
      (my-flatteno a d)
      (my-flatteno b e)
      (appendo d e ys))))


