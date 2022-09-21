(defproject com.danboykis/structured-logging "0.2.1-SNAPSHOT"
  :description "Write data structures to your logs from clojure."
  :url "https://github.com/danboykis/structured-logging"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [net.logstash.logback/logstash-logback-encoder "7.2"]
                 [org.clojure/tools.logging "1.2.4"]
                 [cheshire "5.11.0"]
                 [org.slf4j/slf4j-api "1.7.36"]])
