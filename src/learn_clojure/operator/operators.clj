(ns learn-clojure.operator.operators
  (:gen-class))

(defn operator-example []
  ;; example
  (println (+ 2 1))


  ;; arithmetic operators

  (def x (+ 2 2))
  (println x)

  (def x (- 2 2))
  (println x)

  (def x (* 2 2))
  (println x)

  (def x (float (/ 2 1)))
  (println x)

  (def x (inc 2))
  (println x)

  (def x (dec 2))
  (println x)

  (def x (max 1 2 3 4))
  (println x)

  (def x (min 1 2 3 4))
  (println x)

  (def x (rem 3 2))
  (println x)

  ;; relational operator

  )
(operator-example)
