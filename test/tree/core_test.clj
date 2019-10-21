(ns tree.core-test
  (:require [clojure.test :refer :all]
            [tree.core :refer :all]))

(def t (-> (tree "/")
           (tree (add-child "var"))
           (add-child "lib")
           (add-child "run")
           (tree (add-child "etc"))
           (tree (add-child "home"))))

(def empty-tree (tree "/"))

(deftest tree-test
  (testing "has-children"
    (is (= (has-children t) true))
    (is (= (has-children empty-tree) false)))
  (testing "has-child"
    (is (= (has-child t) true)))
  (testing "get-parent")
  (testing "get-child")
  (testing "get-deep-child"))

