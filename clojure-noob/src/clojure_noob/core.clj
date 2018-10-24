(ns clojure-noob.core
  (:gen-class))

(defn bunch-of-begginer-stuff
  []
  (println "I'm a beautiful little teapot!")

  (println 1)
  (println "a string")
  (println ["a" "vector" "of" "strings"])

  (println (if true
             "By Zeus's hammer!"
             "By Aquaman's trident!"))

  (println (if false
             "By Zeus's hammer!"
             "By Aquaman's trident!"))

  (println (if false
             "By Odin's Elbow!"))

  (println (nil? 1))

  (println (nil? nil))

  (println (= 1 1))

  (println (= nil nil))

  (println (= 1 2))

  (println (or false nil :large_I_mean_venti :why_cant_I_just_say_large))

  (println (or (= 0 1) (= "yes" "no")))

  (println (or nil))

  (println (and :free_wifi :hot_coffee))

  (println (and :feelin_super_cool nil false))

  (def failed-protagonist-names
    ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

  (println failed-protagonist-names))

(defn non-clojure-way-error-message
  []
  (def severity :mild)
  (def error-message "OH GOD! IT'S A DISASTER! WE'RE ")
  (if (= severity :mild)
    (def error-message (str error-message "MILDLY INCONVENIENCED!"))
    (def error-message (str error-message "DOOOOOOOMED!")))

  (println error-message))

(defn clojure-way-error-message
  [severity]
  (def error-message
    (str "OH GOD! IT'S A DISASTER! WE'RE "
         (if (= severity :mild)
           "MILDLY INCONVENIENCED!"
           "DOOOOOOOMED!")))
  (println error-message))

(defn  -main
  "I don't do a whole lot ... yet."
  [& args]

  (bunch-of-begginer-stuff)
  (non-clojure-way-error-message)
  (clojure-way-error-message :jujubinha))