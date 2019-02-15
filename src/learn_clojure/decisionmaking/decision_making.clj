(ns learn-clojure.decisionmaking.decision-making
  (:gen-class))

(defn decision-making []

  ;; if statement
  (println "if statement")
  (if (== 2 2)
    (println "Values are equal")
    (println "Value are not equal"))

  ;; if/do expression
  (if (== 2 3)
    (do (println "Both the value are equal.")
        (println "true"))
    (do (println "Both the value are not equal.")
        (println "false")))

  ;; nested if statement
  (if (and (= 2 2) (= 3 3))
    (println "Values are equal")
    (println "Values are not equal"))

  ;;case statement
  (def x 10)
  (case x
    5 (println "x is 5")
    10 (println "x is 10")
    20 (println "x is 20"))

  ;; cond statement
  (cond
    (= x 5) (println "x is 5")
    (= x 10) (println "x is 10"))
  )
(decision-making)
