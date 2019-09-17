#### La calculatrice en notation polonaise inversée

Le but de cet exercice est de coder une Calculatrice en Notation Polonaise Inversée.



###### Définition

Cette Notation Polonaise Inversée (NPI), ou RPN pour Reverse Polish Notation, permet d'écrire des expressions mathématiques sans utiliser de parenthèses.

Via cette notation, les opérandes précèdent les opérateurs.

###### Exemples

Le calcul d'une addition "2 + 3" s'écrit sous la forme NPI "2 3 +"

Le calcul d'une expression mathématique plus complexe comme "((1 + 2) * 4) + 3" s'écrit de la manière suivante : "1 2 + 4 * 3 +"

Et le calcul d'une expression du type "(1 + 2) * (3 + 4)" s'écrit comme suit : "1 2 + 4 3 + *"


###### Résultats attendus

La fonction, attendue pour la réussite de cet exercice, prend en attribut une chaîne de caractères utilisant la Notation Polonaise Inversée et doit renvoyer le résultat du calcul correspondant à cette chaîne.

Le séparateur entre chaque item de la chaîne en entrée est le caractère espace.