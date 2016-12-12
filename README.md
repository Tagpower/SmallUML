# SmallUML
SmallUML est un langage de modélisation dont l'objectif est permettre la modélisation du domaine métier d'un système d'information.

Il s'agit d'une version simplifiée du diagramme de classes UML, débarrassée des certains concepts liés à la conception de logiciels, comme
la visibilité, les interfaces, les signaux, classes paramétrées, agrégations, dépendances, etc.

## Objectif
L'objectif de ce projet est de spécifier et d'outiller le langage de modélisation SmallUML.
La spécification du langage sera réalisée en trois parties.
Dans la première, la syntaxe abstraite du langage sera spécifiée en EMF.
Dans la deuxième partie, la syntaxe concrète sera spécifiée en Xtext. 

La troisième partie, la sémantique du langage, sera spécifié en se basant sur UML: les concepts de SmallUML seront traduits en des concepts UML grâce au langage de transformation ATL. 

## Travail à réaliser

Le projet sera réalisé individuellement ou en binômes. Les projets réalisés par des groupes de plus de 2 étudiants ne seront pas évalués.

Avant l'échéance, chaque groupe déposera ses livrables sur le serveur [Madoc](http://madoc.univ-nantes.fr/).



## Préparation
Un squelette de projet se trouve sur GitLab de l'Université, sur le dépôt suivant:
[SmallUML](https://gitlab.univ-nantes.fr/sunye-g/smalluml). 
Clonez ce projet pour commencer:

    git clone https://gitlab.univ-nantes.fr/sunye-g/smalluml.git

Il s'agit d'un _workspace_ Eclipse, contenant les projets suivants:

- UML: Un projet EMF contenant le méta-modèle UML, version 2.5
- SmartUML: Un projet EMF devant contenir le méta-modèle de SmallUML
- SmallToUML: Un projet ATL devant contenir les règles de transformation de modèles SmallUML en UML
- org.smalluml.SmallUML: Un projet Xtext devant contenir la syntaxe concrète du langage textuel SmallUML

## Travail à rendre

Travail à rendre avant le 19 décembre 2016:

- Le projet, sous la forme d'une archive ou d'une URL vers un gestionnaire de versions. 
- Le projet doit contenir, en plus du code source, un document expliquant le langage proposé ainsi que son utilisation.