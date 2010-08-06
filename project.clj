(defproject keyhole "1.0.0-SNAPSHOT"
  :description "Launches a Clojure/Incanter repl from the Java code, passing in the indicated Java variables to the repl."
  :dependencies [[org.clojars.cryptic_star/clj-swingrepl "1.0.0-SNAPSHOT"]
                 [org.clojars.cryptic_star/incanter "1.2.3-SNAPSHOT"]]
  :dev-dependencies [[lein-javac"0.0.2-SNAPSHOT"]
                     [lein-clojars "0.5.0-SNAPSHOT"]]
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :aot [keyhole])
