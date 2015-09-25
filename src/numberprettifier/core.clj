(ns numberprettifier.core
  (:gen-class))

(def ^:private trillion 1000000000000N)
(def ^:private billion 1000000000N)
(def ^:private million 1000000)


(defn number-prettifier
  "Returns a prettified version of the number, i.e. 1000000 will become 1M and so on."
  [number]
  (cond
    (<= 1 (quot number trillion)) (str (quot number trillion) "T")
    (<= 1 (quot number billion)) (str (quot number billion) "B")
    (<= 1 (quot number million)) (str (quot number million) "M")
    :else (str number)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(comment

  )
