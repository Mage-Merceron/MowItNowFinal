# MowItNowFinal

## Cloner et exécuter le répository
1. cloner le répository 
`git clone https://github.com/Mage-Merceron/MowItNowFinal.git`
2. Ouvrir le répository dans `IntelliJ` ou bien `VS Code`. 
3. Lancer l'oject `main.scala` pour avoir les résultats. 

## Présentation : 

La société MowItNow a décidé de développer une tondeuse à gazon automatique, destinée aux surfaces rectangulaires.

La position de la tondeuse est représentée par une combinaison de **coordonnées (x,y)** et d'une lettre indiquant **l'orientation selon la notation cardinale anglaise (N,E,W,S)**. La pelouse est divisée en grilles pour simplifier la navigation.

Pour contrôler la tondeuse, on lui envoie une simple séquence de lettres. Les lettres possibles sont « D », « G » et « A ». « D » et « G » font pivoter la tondeuse de 90° à droite ou à gauche respectivement, sans la déplacer. « A » signifie que l'on avance la tondeuse d'une case dans la direction à laquelle
elle fait face, et sans modifier son orientation.

Pour programmer la tondeuse, on lui fournit un fichier d'entrée construit comme suit :

• La première ligne correspond aux coordonnées du coin supérieur droit de la pelouse,
celles du coin inférieur gauche sont supposées être (0,0).
• La suite du fichier permet de piloter toutes les tondeuses qui ont été déployées.

Chaque tondeuse a deux lignes la concernant :
- la première ligne donne la position initiale de la tondeuse, ainsi que son
orientation. La position et l'orientation sont fournies sous la forme de 2 chiffres
et une lettre, séparés par un espace.
- la seconde ligne est une série d'instructions ordonnant à la tondeuse d'explorer
la pelouse. Les instructions sont une suite de caractères sans espaces.


Le fichier suivant est fourni en entrée :
`5 5
1 2 N
GAGAGAGAA
3 3 E
AADAADADDA
`

On attend le résultat suivant (position finale des tondeuses) :
`Tondeuse 1 : 1 3 N
Tondeuse 2 : 5 1 E
`
