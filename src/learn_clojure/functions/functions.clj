(ns learn-clojure.functions.functions
  (:gen-class))

;; defining function
;; (defn functionname
;; "optional documentation string"
;; [arguments]
;; (code block))
(defn Example []
  (def x 1.3)
  (def y 1.5)
  (def hello "Hello")
  (println hello (+ x y))

  ;; anonymous function
  ((fn [x] (* 2 x)) 2)
  (println "value x" x)

  ;; function multiple argument
  (defn demo [x y]
    (println (+ x y)))
  (demo 2 3)
  ;; variadic function
  (defn demo-variadic-function [message & other]
    (str message (clojure.string/join " " other)))
  (println (demo-variadic-function "Hello" "This" "is" "then" "message"))
  ;; higher order function
  (println (filter even? (range 0 10))))
(Example)
