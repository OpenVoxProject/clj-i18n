(defproject org.openvoxproject/i18n-example-program "0.1.0"
  :description "A sample use of the i18n library"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.4"]
                 [org.openvoxproject/i18n "1.0.3"]]
  :plugins      [[org.openvoxproject/i18n "1.0.3"]]
  :main puppetlabs.i18n-example-program.main
  :aot [puppetlabs.i18n-example-program.main])
