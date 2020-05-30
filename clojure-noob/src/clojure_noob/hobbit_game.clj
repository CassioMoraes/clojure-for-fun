(ns clojure-noob.hobbit-game)

(def asym-hobbit-body-parts [{:name "head" :size 3}
    {:name "left-eye" :size 1}
    {:name "left-ear" :size 1}
    {:name "mouth" :size 1}
    {:name "nose" :size 1}
    {:name "neck" :size 2}
    {:name "left-shoulder" :size 3}
    {:name "left-upper-arm" :size 3}
    {:name "chest" :size 10}
    {:name "back" :size 10}
    {:name "left-forearm" :size 3}
    {:name "abdomen" :size 6}
    {:name "left-kidney" :size 1}
    {:name "left-hand" :size 2}
    {:name "left-knee" :size 2}
    {:name "left-thigh" :size 4}
    {:name "left-lower-leg" :size 3}
    {:name "left-achilles" :size 1}
    {:name "left-foot" :size 2}])

(defn matching-part
[part]
{:name (clojure.string/replace (:name part) #"^left-" "right-")
:size (:size part)})

(defn simmetrize-body-parts
"Expect a sequence of maps that have a :name and a :size"
[asym-body-parts]
(loop [remaining-body-parts asym-body-parts
final-body-parts []]
(if (empty? remaining-body-parts)
final-body-parts
(let [[part & remaining] remaining-body-parts]
(recur remaining
(into final-body-parts
(set [part (matching-part part)])))))))

(defn reduce-simmetrize-body-parts
"Expect a sequence of maps that have a :name and a :size"
[asym-body-parts]
(reduce (fn [final-body-parts part]
(into final-body-parts (set [part (matching-part part)])))
[]
asym-body-parts))

(defn hit
[]
(let [sym-parts (reduce-simmetrize-body-parts asym-hobbit-body-parts)
body-parts-size-sum (reduce + (map :size sym-parts))
target (rand body-parts-size-sum)]
(loop [[part & remaining] sym-parts
accumulated-size (:size part)]
(if (> accumulated-size target)
part
(recur remaining (+ accumulated-size (:size (first remaining))))))))