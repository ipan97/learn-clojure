(ns learn-clojure.loops.loops
  (:gen-class))

(defn loop-example []
  ;; while statement
  (def x (atom 1))
  (while (< @x 5)
    (do
      (println @x)
      (swap! x inc)))

  ;; doseq statement
  (doseq [n [0 1 2]]
    (println n))

  ;; dotimes statement
  (dotimes [n 5]
    (println n))

  ;; loop statement
  (loop [x 10]
    (when (> x 1)
      (println x)
      (recur (- x 2)))))
(loop-example)
