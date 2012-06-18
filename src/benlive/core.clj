(ns benlive.core
  (:require [clojure.java.io :as io]
            [compojure.route :as route]
            [net.cgrand.enlive-html :as eh]
            [ring.adapter.jetty])
  (:use [compojure.core]))

(eh/deftemplate index-html (io/file "src/benlive/index.html")
  [id]
  [:p#message] (eh/content (format "Hello, %s!" id)))

(defroutes handler
  (GET "/" [] (index-html "Enlive"))
  (route/not-found "not-found"))

(defn -main [& args]
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (ring.adapter.jetty/run-jetty handler {:port port})))

