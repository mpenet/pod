(defproject cc.qbits/pod "0.2.0"
  :description ""
  :url "https://github.com/mpenet/pod"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :dev  {:dependencies []}
             :test  {:dependencies []}}
  :codox {:src-dir-uri "https://github.com/mpenet/pod/blob/master"
          :src-linenum-anchor-prefix "L"
          :output-dir "doc/codox"}
    :source-paths ["src/clj"]
    :global-vars {*warn-on-reflection* true})
