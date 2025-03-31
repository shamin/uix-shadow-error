(defproject lein-shadow "0.1.0-SNAPSHOT"
  :profiles {:cljs {:dependencies [[thheller/shadow-cljs "2.19.0"]
                                   [com.pitch/uix.core "1.4.2"]
                                   [com.pitch/uix.dom "1.4.2"]]
                    :source-paths ["src/cljs"]}})
