# DEPENDECIES

### Spring Web (WEB)
#### => Web
Build web, including RESTful, applications using Spring MVC.
Uses Apache Tomcat as the default embedded container.

### Spring Data JPA (SQL)
#### => JPA
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

### Validation (I/O)
#### => Hibernate
JSR-303 validation with Hibernate validator.

### H2 Database (SQL)
#### => H2
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint.
Supports embedded and server modes as well as a browser based console application.

### Spring Boot DevTools (DEVELOPER TOOLS)
#### => DevTools
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

### Thymeleaf (TEMPLATE ENGINES)
#### => Thymeleaf
A modern server-side Java template engine for both web and standalone environments.
Allows HTML to be correctly displayed in browsers and as static prototypes

# Partie 1

## ETAPE 13
### question 1
C'est le " @GetMapping("/greeting") " qui sert à paramétrer l'url d'appel /greeting

### question 2
C'est " String greeting(@RequestParam(name="nameGET",required=false, defaultValue="World") String nameGET, Model model)  " qui choisi le fichier HTML à afficher

### question 3
C'est " model.addAttribute("nomTemplate", nameGET); " qui sert à envoyer le nom + le " return "greeting"; " après


## ETAPE 17
Le dossier "INFORMATION_SCHEMA" s'est créé, ainsi que la table "ADRESS3

## ETAPE 18
Le template Hibernate de Spring est ajouté au projet via les dépendences et permet ensuite d'effectuer les manipulations de données (insertion, sélection, mise à jour et suppression) dans la base de données.
Il va donc ici récupérer les tables que l'on a créé dans le programme sous forme d'attributs de classe (dans la classe Adresse.java notamment) et les insérer dans la base de données.

## ETAPE 20
J'ai effectué la requête "SELECT * FROM ADDRESS" et en réponse j'ai bien eu un tableau avec les informations rentrées précédemment

## ETAPE 23
L'annotation @Autowired permet de marquer une dépendance que Spring va par la suite résoudre et injecter, c'est-à-dire que l'on signifie à Spring que l'on a besoin d'utiliser une dépendance ici.

# Partie 2

## ETAPE 6

### Q1
Oui, une clé API est nécessaire pour appeler OpenWeatherMap (mais c'est gratuit)

### Q2
Il faut appeler l'url api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key} pour pouvoir l'utiliser avec des coordonées GPS
 {lat} et {lon} correspondent respectivement à la latitude et à la longitide et API key} correpond à la clé API
 
 ### Q3
L'API OpenWeatherMap utilise la methode GET, pour envoyer les données à notre template on utilise la méthode POST car on envoie des données

 ### Q4
 La clé ne varie jamais donc on peut la déclarer comme constante dans la classe Meteo.java
 La longitude et la latitude sont récupérées depuis la première réponse de l'API geo.gouv et passées directement en paramètre dans l'url appemlant l'API
 
 ### Q5
 #### A
  Il faut récupérer la réponse de l'API OpenWeatherMap puis récupérer le main puis récupérer sa température
 
 #### B
 Il faut récupérer la réponse de l'API OpenWeatherMap puis récupérer le premier résultat dans l'ArrayList des différentes météos trouvées puis récupérer l'attribut description qui correspond à la prévision météo
 
 
 # Lien GitHub