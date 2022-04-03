# Création de l'application : Bankit 🏦

Bankit est une application de gestion bancaire pour les agences. Le but est de pouvoir repondre aux questions des clients facilement et les aider à faire des transactions dans leur compte bancaire, comme lors que quelqu'un est reçu en agence.

## La description

Grâce à la base de données, nous gérons **les agents** avec leurs informations de login, **les clients** avec leur numéro de compte, le montant, la date de création du compte, et une valeur qui indique s'il a un pret en cours, et **les transactions** faites, avec le montant, la date et le numéro de compte de la personne qui a réalisé la transaction.
Les classes codées en Java sont donc dédiées au déploiment des differentes fenetres graphiques, ainsi qu'aux differentes methodes classées comme l'indique ci-dessous :
* Les methodes **de requette** : dont leur role principal est de rechercher, créer ou modifier les informations dans la base de données,
* les methodes **de connexion** : sur la classe ConnectionSQL, dont leur rôle est établir et fermer la connexion avec la base de données,
* les methodes **de calcul** : dont leur role est calculer le taux d'intéret en fonction du type de prêt, et de calculer la mensualité par concéquent, et
* Les methodes **d'intéraction avec la fenetre graphique** : situées dans les clases qu'inicialisent les fenetres, permettent de rendre les intéractions plus dynamiques.

## Commencer

### Dépendances

* Base de données SQLite : driver necessaire pour la connexion (déjà sur le projet). Si vous n'utilisez pas SQLite, telechargez est installez sur la librairie le driver adapté.
* Application Eclipse

### Installation

* Telechargez le fichier ZIP, extrayez les fichers, et ouvrez l'ensemble sur Eclipse
* Changez les informations de la base de données BankidBd si vous le souhaitez.

### Exécution du programme

* Initialiser le programme dans la classe : FenetreLogin
* Introduisez votre Login et votre mot de passe
* La fenettre de l'application se lancera, vous pourrez donc executer les actions que vous souhaitez :
    * Réalisation d'une transaction
    * Recherche des informations d'un client
    * Recherche des informations d'une transaction
    * Calcul d'une mensualité en fonction du type de pret
    * Changement du mot de passe de l'agent
    * Ajout d'un agent

## Aide

Des fenetres indiquant le problème apparettront pour vous aider lors d'un erreur d'execution.

## Auteurs

[Katerine Rodriguez](https://github.com/rodrigka)

## Historique des versions

* 10
    * Ajout des tests.
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/e72af2053c3ae678caf69d79261b4bcb1c269e0b)
* 9
    * Ajout d'interfaces pour bien classer les méthodes + Mise des "ActionPerformed" en dehors de la méthode d'affichage de la fenêtre graphique "initialize".
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/bb536da842de4826ec7336f6632038d1ec3e5a41)
* 8
    * Finalisation de toutes les méthodes "EventListener" + Retrait de la partie accueil (finalement pas très esthétique) + retrait des classes en trop + Réalisation de la méthode Table(), qui récupère les valeurs de la table Transactions pour les afficher dans le panel "MesClients".Seul problème à résoudre : l'organisation MVC, qui s'avère plus compliquée que prévu.
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/a393dd73b22f1b0416d97f2474c69f4070937db1)
* 7
    * Calcul de l'emprunt fonctionnel + Initiation de la partie dediée à la gestion des clients
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/0a0bd4419d4c7cf332e6fe478703888958bf6a06)
* 6
    * Suite sur la methode de calcul du pret
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/f1357332e75237e502f7cc3144603c6d9922c9ed)
* 5
    * Ajout des fonctionnalités des boutons, changement des noms de certaines classes, etc...
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/54dfa873f12251e049d52e663bd0817d891f313a)
* 4
    * Ajout de la methode pour calculer la mensualité d'un prêt
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/09a61887f48cdd13607c59724521b95ab971debd)
* 3
    * Correction du statement (SQLConnection)
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/02c9edf253ebdc8f3efbf74c858ace5d2a13043e)
* 2
    * Création de la requête SQL pour le login et le mot de passe. Réattribution des méthodes main a chaque frame. Problème : c.statement est nul.
    * Voir [Changement](https://github.com/rodrigka/Bankit/commit/b7a473da0d4bca461d054a35a66359374e0fc3b0)
* 1
    * Première version

## Licence

Ce projet est sous la licence [Eclipse Public License 2.0] - voir le fichier LICENSE.md pour plus de détails

## Remerciements

* Toute la communauté de  : https://stackoverflow.com/ 
* Toute la communauté de  : https://www.developpez.net/forums/
* M. Guillaume Tessier qui m'a beaucoup aidé à avancer lors dae la réalisation de certaines methodes
* M. Arthur Moreau pour son aide avec les fenetres graphiques.
