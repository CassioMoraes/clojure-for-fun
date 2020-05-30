(ns clojure-noob.clojure-errors)

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