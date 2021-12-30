(ns day8.core-test
  (:require [clojure.test :refer :all]
            [day8.core :refer :all]))

(def sample '())

(deftest parse-input-test
  (is (= sample (parse-input (slurp "sample input")))))

(deftest solve-1-test
  (is (= 1 (solve-1 sample)))
  ;; (is (= 2 (solve-1 (parse-input (slurp "input")))))
  )

;; (deftest solve-2-test
;;   (is (= 1 (solve-2 sample)))
;;   (is (= 2 (solve-2 (parse-input (slurp "input")))))
;;   )