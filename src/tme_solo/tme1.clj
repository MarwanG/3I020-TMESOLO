
;;;; ================================================
;;;; = 3I020 - Principes des programmes déclaratifs =
;;;; ================================================
;;;; = TME Solo - édition 2017/2018                 =
;;;; ================================================

(ns tme-solo.tme1
  (:use midje.sweet))

;;; DUREE : 45 minutes

;;; IMPORTANT
;;; - les trois exercices du TME sont indépendants
;;; - pendant le TME il est interdit de communiquer, par quelque moyen que ce soit
;;;   avec d'autres étudiants
;;; - tous les supports de cours sont autorisés, de même que l'accès aux documents
;;;   clojure en ligne.


;;; Exercice 1 :
;;; ==========

;;; Dans cet exercice, l'efficacité de votre programme est un critère important

;;; Question 1.1:

;;; Compléter la définition de fonction suivante :


(defn reverse-list [l]
  "Retourne la liste inversée"
  nil)

;; afin de valider les tests ci-dessous:

(fact "à propos de `reverse-list`."
       (reverse-list ())
       => ()

       (reverse-list '(2))
       => '(2)

       (reverse-list '(:a :b :c :d))
       => '(:d :c :b :a)

       (reverse-list (range 10))
       => '(9 8 7 6 5 4 3 2 1 0))

;;; Question 1.2:

;;; Compléter la définition de fonction suivante :

(defn reverse-vect [v]
  nil)



;; afin de valider les tests ci-dessous:

(fact "à propose de `reverse-vect`."
       (reverse-vect [])
       => []

       (reverse-vect [2])
       => [2]

       (reverse-vect [:d :c :b :a])
       => [:a :b :c :d])

;;; Exercice 2 :
;;; ==========

;;; Compléter la définition de fonction suivante :

(defn floyd []
  nil)



;; afin de valider les tests ci-dessous:

(facts "a propose de floyd" 
  (take 4 (floyd))
  => '((1) (2 3) (4 5 6) (7 8 9 10))

  (take 3 (floyd))
  => '((1) (2 3) (4 5 6))

  (take 1 (floyd))
  => '((1)))


;;; Exercice 3
;;; ==========

;;; Question 3.1

;;; On souhaite définir l'implication logique sous la
;;; forme d'une macro Clojure.


(declare implication-binaire-trans)

(defmacro ==> [expr1 expr2]
  (implication-binaire-trans expr1 expr2))

;;; Compléter la définition de fonction suivante :

(defn implication-binaire-trans [expr1 expr2]
  nil)



;; afin de valider les tests ci-dessous:

(facts "a propos de l'implication binaire"
       (==> false false) => true
       (==> false true) => true
       (==> true false) => false
       (==> true true) => true

       (==> false (+ 23 19)) => true
       (==> true (+ 22 19)) => 41

       (==> 42 (> 2 12)) => false
       )

;;; Question 3.2
;;; ============

;;; On généralise maintenant à l'implication n-aire

(declare implication-naire-trans)

(defmacro ===> [& exprs]
  (if (< (count exprs) 2)
    (throw (ex-info "Il faut au moins deux arguments" {:exprs exprs}))
    ;; On sait que exprs est au moins de taille 2
    (implication-naire-trans exprs)))

;;; Remarque :
;;; (===> a b c d)  =   (==> a (==> b (==> c d)))

;;; Compléter la définition de fonction suivante :

(defn implication-naire-trans [exprs]
  nil)

;; afin de valider les tests ci-dessous:


(facts "à propos de l'implication n-aire"
       (===> false false) => true
       (===> false true) => true
       (===> true false) => false
       (===> true true) => true

       (===> false true (+ 23 19)) => true
       (===> true false (+ 23 19)) => true
       (===> true true (+ 23 19)) => 42
       
       (===> 42 true (> 2 12)) => false
       )
