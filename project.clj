(defproject numberprettifier "0.1.0-SNAPSHOT"
  :description "This is a number prettifier application"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot numberprettifier.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
