(defproject org.openvoxproject/i18n "1.0.1"
  :description "Clojure i18n library"
  :url "http://github.com/openvoxproject/clj-i18n"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.11.2"] ;; Match what is used in clj-parent
                 [cpath-clj "0.1.2"]
                 [org.gnu.gettext/libintl "0.18.3"]]

  :profiles {:dev {:dependencies [[org.openvoxproject/kitchensink "3.5.2"
                                   :exclusions [org.clojure/clojure]]]
                   :plugins [[jonase/eastwood "1.4.3"
                              :exclusions [org.clojure/clojure]]]}}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]
  :eval-in-leiningen true)
