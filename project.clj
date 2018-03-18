(defproject tme-solo-2016 "0.0.1-SNAPSHOT"
  :description "TME Solo -- 2017/2018"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.3" :exclusions [org.clojure/clojure]]]
                   :plugins [[lein-midje "3.2.1"]]}})
