(ns clojure-noob.begginer-stuff)

(defn bunch-of-begginer-stuff
    []
    (println "I'm a beautiful little teapot!")
  
    (println 1)
    (println "a string")
    (println ["a" "vector" "of" "strings"])
  
    ; (println "a panda in the library ".concat"with a dust bonder")
  
    (println (if true
               "By Zeus's hammerrrr!"
               "By Aquaman's trident!"))
  
    (println (if false
               "By Zeus's hammer!"
               "By Aquaman's trident!"))
  
    (if true
      (do (println "By Zeus's hammer!"
                   "By Aquaman`s trident!")))
  
    (when true
      (println "Success"
               "abra cadabra"))
  
    (println "if false = " (if false
                             "By Odin's Elbow!"))
  
    (println "nil? 1 = " (nil? 1))
  
    (println "nil? nil = " (nil? nil))
  
    (println "= 1 1" (= 1 1))
  
    (println "= nil nil" (= nil nil))
  
    (println "= 1 2" (= 1 2))
  
  ; OR examples
    (println (or false nil :large_I_mean_venti :why_cant_I_just_say_large))
  
    (println (or (= 0 1) (= "yes" "no")))
  
    (println (or nil))
  ; In the first example, the return value is :large_I_mean_venti because it’s the first truthy value. 
  ; The second example has no truthy values, so or returns the last value, which is false. 
  ; In the last example, once again no truthy values exist, and or returns the last value, which is nil.
  
  ; AND examples
    (println (and :free_wifi :hot_coffee))
  
    (println (and :feelin_super_cool nil false))
  ; In the first example, and returns the last truthy value, :hot_coffee.
  ; In the second example, and returns nil, which is the first falsey value.
  
    (def failed-protagonist-names
      ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])
  
    (println failed-protagonist-names))