## Analyse SOLID de la solution AntiPattern de l'application Sudoku

### Single Reponsibility Principle 
La classe sudoku possède des méthodes qui gèrent l'interface de
l'application dedans cette classe. Ce qui ne respecte pas le
principe S de SOLID
### Open/Closed Principle 
Si on voudrais ajouter une nouvelle fonctionalité dans 
notre application on devrait changer le code entier de plusieures
classes dedans notre classe. Ce qui ne respecte pas le principe 
OPEN/CLOSED. 
### Liskov Substitution principle 
Cette classe ne possède pas des enfants du coup ce principe
ne peut pas être appliqué. 
### Interface Segregation Principle 
Ce modele ne possède pas des interfaces, alors 
ce principe ne peut pas être appliqué a notre application 
antipattern. 
### Dependency Inversion Principle 
"" "" "" "" "" """ " "" "" "" "" "" "" 

## Comment le MVC pattern peut nous aider à résoudre ces problématiques

Le MVC pattern va diviser l'application en 3 parties. Donc 3 dossiers. 
Toutes les classes, ou fonctionnalités qui s'occupent de la 
gestion visuelle de l'application vont être regroupés dans le
fichier view

Toutes les classes et les fonctionnalités qui vont représenter les données
de notre application vont être stockées dans ce fichier

Toutes les classes et fonctionalités qui vont controller, ou 
modifier les elements dans modèle et vont les afficher dans view
vont être régroupées dans le fichier controller. 

Cette architecture va nous permettre de respecter le premier principe
des 5 SOLID. Single Responsibility Principle. 
## Comment l'Observator pattern est pertinent dans notre application
L'observator pattern est pertinent pour l'actualisation et affichage de notre sudoku. 
Chaque fois qu'on modifie notre sudoku, on devra notifier l'utilisateur. 
Ce pattern nous permet de faire justement ça. 
On devra simplement implementer une interface pour toutes les classes
qui seront observées par notre objet. 
## Comment le Command Pattern est pertinent pour notre application 
Le command pattern nous permet de structurer d'une manière plus logique et orientée envers 
l'utilisateur à l'application. Chaque fois qu'un utilisateur déclenchera une fonctionalité 
dans l'application. Une commande devra être chargée de réaliser ce changement. 
## Comment le Composite Pattern est pertinent pour notre application 
Le composite pattern permet de séparer les cells du sudoku. 
On peut donc théoriquement implémenter le pattern 
## COmment le Strategy Pattern est pertinent pour notre application 