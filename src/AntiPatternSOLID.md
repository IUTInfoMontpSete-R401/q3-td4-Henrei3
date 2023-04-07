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
## Comment le "Observeur pattern" est pertinent dans notre application pattern 
L'observeur pattern est pertinent pour l'actialisation et affichage de notre sudoku. 
Chaque fois qu'on modifie notre sudoku, on devra notifier l'utilisateur. 
Le pattern de conception Observeur nous permet faire justement ça. 
On devra simplement faire implementer d'une interface toutes les classes qui sont des observeurs
de Notre objet a observer. 
## Comment le Command Pattern est pertinent pour notre application 
Le command pattern nous permet de structurer d'une manière plus logique et orientée envers 
l'utilisateur à l'application. Chaque fois qu'un utilisateur déclenchera une fonctionalité 
dans l'application. Une commande devra être la chargée de réaliser ce changement. 
## Comment 