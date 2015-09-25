(ns numberprettifier.core-test
  (:require [clojure.test :refer :all]
            [numberprettifier.core :refer :all]))

(deftest number-prettifier-test
  (testing "The number prettifier function"
    (is (= "1M" (prettify 1000000)))
    (is (= "2.5M" (prettify 2500000.35)))
    (is (= "532" (prettify 532)))
    (is (= "1.1B" (prettify 1123456789)))
    (is (= "2.9T" (prettify 2923456789000N)))
    (is (= "2923.5T" (prettify 2923456789000000N)))
    (is (= "0" (prettify 0)))
    (is (= "-1" (prettify -1)))
    (is (= "-1M" (prettify -1000000)))
    (is (= "-2.9T" (prettify -2923456789000N)))
    (is (= "1" (prettify 1000000 million)))
    (is (= "2.5" (prettify 2500000.35 million)))
    (is (= "0.0" (prettify 532 million)))
    (is (= "1.1" (prettify 1123456789 billion)))
    (is (= "2923.5" (prettify 2923456789000000N trillion)))
    (is (= "2.9" (prettify 2923456789000N trillion)))
    (is (= "0" (prettify 0 million)))
    (is (= "-0.0" (prettify -1 million)))
    (is (= "-1" (prettify -1000000 million)))))

