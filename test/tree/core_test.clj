(ns tree.core-test
  (:require [clojure.test :refer :all]
            [tree.core :refer [sum]]))

(def n 5)

(deftest a-test
  (testing "sum function"
    (is (= n (sum 3 2)))))
