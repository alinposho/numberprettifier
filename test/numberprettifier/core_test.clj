(ns numberprettifier.core-test
  (:require [clojure.test :refer :all]
            [numberprettifier.core :refer :all]))

(deftest number-prettifier-test
  (testing "The number-prettifier function"
    (is (= "1M" (number-prettifier 1000000)))
    (is (= "2.5M" (number-prettifier 2500000.35)))
    (is (= "532" (number-prettifier 532)))
    (is (= "1.1B" (number-prettifier 1123456789)))
    (is (= "2.9T" (number-prettifier 2923456789000000N)))
    (is (= "0" (number-prettifier 0)))
    (is (= "-1" (number-prettifier -1)))
    (is (= "-1000000" (number-prettifier -1000000)) "Negative numbers are not prettified")
    ))

