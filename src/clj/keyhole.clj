(ns keyhole
  (:use org.dipert.swingrepl.main)
  (:use incanter.core)
  (:import (javax.swing JFrame))
  (:gen-class
    (:methods [[run [Collection] null]])))

(defn unzip [arg-map]
  (loop [key-vals '()
         val-vals '()
         remaining arg-map]
    (if (empty? remaining)
      {:keys key-vals :values val-vals}
      (recur (conj key-vals (first remaining))
             (conj val-vals (second remaining))
             (drop 2 remaining)))))

(defn build-interns [arg-map]
  (loop [remaining arg-map]
    (if (not (empty? remaining))
      (do
        (intern *ns* (first (first remaining)) (second (first remaining)))
        (recur (drop 1 remaining))))))

(defn run [& args]
  (def arg-lists (unzip args))
  (build-interns (zipmap (map read-string (:keys arg-lists)) (:values arg-lists)))
  (make-dbg-repl-jframe {:on-close JFrame/EXIT_ON_CLOSE}))
