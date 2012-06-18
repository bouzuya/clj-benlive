(defproject benlive "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.1.0"]
                 [enlive "1.0.1"]
                 [ring "1.1.1"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler benlive.core/handler})

