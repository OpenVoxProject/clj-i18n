(defproject org.openvoxproject/i18n "1.0.4-SNAPSHOT"
  :description "Clojure i18n library"
  :url "http://github.com/openvoxproject/clj-i18n"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :pedantic? :abort

  ;; Generally, try to keep version pins in :managed-dependencies and the libraries
  ;; this project actually uses in :dependencies, inheriting the version from
  ;; :managed-dependencies. This prevents endless version conflicts due to deps of deps.
  ;; Renovate should keep the versions largely in sync between projects.
  :managed-dependencies [[org.clojure/clojure "1.12.4"]
                         [cpath-clj "0.1.2"]
                         [org.gnu.gettext/libintl "0.18.3"]
                         [org.openvoxproject/kitchensink "3.5.5"]]

  :dependencies [[org.clojure/clojure]
                 [cpath-clj]
                 [org.gnu.gettext/libintl]]

  :profiles {:dev {:dependencies [[org.openvoxproject/kitchensink]]
                   :plugins [[jonase/eastwood "1.4.3"
                              :exclusions [org.clojure/clojure]]]}}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]
  :eval-in-leiningen true)
