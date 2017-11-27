(ns test-lein.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
  (println (+ 4 (* 2 5)))
  (println (+ 1 2 3 4 5))
  (println ((fn [name] (str "Tervetuloa Tylypahkaan " name)) "Mikko"))
  (println (get-in {:name {:first "Urho" :middle "Kaleva" :last "Kekkonen"}} [:name :middle]))
  
  