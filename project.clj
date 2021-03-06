(defproject peruse "0.1.0-SNAPSHOT"
  :description "Online news reader"
  :url "https://github.com/fdb/peruse"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.novemberain/monger "1.5.0-rc1"]
                 [rome "1.0"]
                 [compojure "1.1.5"]
                 [ring "1.1.8"]
                 [hiccup "1.0.3"]]
  :main peruse.web)
