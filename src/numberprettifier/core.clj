(ns numberprettifier.core
  (:gen-class))

(def trillion 1000000000000N)
(def billion 1000000000N)
(def million 1000000)

(defn- in-range
  "Determine id a number is in a specified short scale range."
  [qt number]
  (<= 1 (quot number qt)))

(defn prettify
  "Returns a prettified version of the number, i.e. 1000000 will become 1M and so on."
  ([number]
   {:pre [(pos? number)]}
   (cond
     (in-range trillion number) (str (prettify number trillion) "T")
     (in-range billion number) (str (prettify number billion) "B")
     (in-range million number) (str (prettify number million) "M")
     :else (str number)))
  ([number qt]
   {:pre [(pos? number)]}
   (if (zero? (mod number qt))
     (str (quot number qt))
     (format "%.1f" (/ (double number) qt)))))

(defn -main
  "A function that takes a number as an input and returns the prettified string version of it."
  [& args]
  (println (str "The prettified version of the number is="
                (prettify (read-string (first args))))))

(comment
  (in-range trillion 1123456789)                            ;; determins whether the number is in the trillions range
  (in-range billion 1123456789)

  (prettify 0 million)
  )
