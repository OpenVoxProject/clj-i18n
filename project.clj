(defproject org.openvoxproject/i18n "0.9.3-SNAPSHOT"
  :description "Clojure i18n library"
  :url "http://github.com/openvoxproject/clj-i18n"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cpath-clj "0.1.2"]
                 [org.gnu.gettext/libintl "0.18.3"]]

  :profiles {:dev {:dependencies [[org.openvoxproject/kitchensink "3.4.2"
                                   :exclusions [org.clojure/clojure]]]
                   :plugins [[jonase/eastwood "0.8.1"
                              :exclusions [org.clojure/clojure]]]}}

  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]
  :eval-in-leiningen true)
