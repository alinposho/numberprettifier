(ns numberprettifier.core
  (:gen-class))

(def trillion 1000000000000N)
(def billion  1000000000N)
(def million  1000000)

(defn prettify [number qt]
  "Returns a prettified version of the "
  (if (zero? (mod number qt))
    (str(quot number qt))
    (format "%.1f"(/ (double number) qt))))


(defn number-prettifier
  "Returns a prettified version of the number, i.e. 1000000 will become 1M and so on."
  [number]
  (cond
    (<= 1 (quot number trillion)) (str (prettify number trillion) "T")
    (<= 1 (quot number billion)) (str (prettify number billion) "B")
    (<= 1 (quot number million)) (str (prettify number million) "M")
    :else (str number)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(comment

  )
