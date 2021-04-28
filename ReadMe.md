#Projet d'apprentissage de Java JSE & JEE

##Arborescence du projet

```
.
├── 2020-java-modelisation-app
│   ├── build
│   │   └── classes
│   │       ├── abstracts
│   │       ├── core
│   │       │   ├── abstracts
│   │       │   │   ├── Brass.class
│   │       │   │   ├── Percussion.class
│   │       │   │   ├── Stringed.class
│   │       │   │   ├── Wind.class
│   │       │   │   └── Woodwind.class
│   │       │   ├── interfaces
│   │       │   │   └── Instrument.class
│   │       │   ├── starwars
│   │       │   └── tools
│   │       │       ├── BDDConnector.class
│   │       │       ├── Calcul.class
│   │       │       ├── Fichiers.class
│   │       │       ├── MesDates.class
│   │       │       ├── Planning.class
│   │       │       └── Visite.class
│   │       ├── exos
│   │       │   ├── sqltablesaves
│   │       │   │   ├── A_Base.sql
│   │       │   │   ├── B_createTable.sql
│   │       │   │   └── C_Save_2021_04_27_univcergy22.sql
│   │       │   └── starwars
│   │       │       ├── Acces.class
│   │       │       ├── Acteur.class
│   │       │       ├── DAOFilm.class
│   │       │       ├── Film$1.class
│   │       │       ├── Film.class
│   │       │       ├── Gentil.class
│   │       │       ├── Mechant.class
│   │       │       └── Personnage.class
│   │       ├── exos\ copie
│   │       │   └── sqltablesaves
│   │       ├── file.txt
│   │       ├── fr
│   │       │   └── ldumay
│   │       │       ├── Main.class
│   │       │       └── others
│   │       │           ├── Console.class
│   │       │           └── DateConversion.class
│   │       ├── interfaces
│   │       └── tools
│   ├── build.xml
│   ├── manifest.mf
│   ├── nbproject
│   │   ├── build-impl.xml
│   │   ├── genfiles.properties
│   │   ├── private
│   │   │   ├── config.properties
│   │   │   ├── private.properties
│   │   │   └── private.xml
│   │   ├── project.properties
│   │   └── project.xml
│   ├── src
│   │   ├── core
│   │   │   ├── abstracts
│   │   │   │   ├── Brass.java
│   │   │   │   ├── Percussion.java
│   │   │   │   ├── Stringed.java
│   │   │   │   ├── Wind.java
│   │   │   │   └── Woodwind.java
│   │   │   ├── interfaces
│   │   │   │   └── Instrument.java
│   │   │   └── tools
│   │   │       ├── BDDConnector.java
│   │   │       ├── Calcul.java
│   │   │       ├── Fichiers.java
│   │   │       ├── MesDates.java
│   │   │       ├── Planning.java
│   │   │       └── Visite.java
│   │   ├── exos
│   │   │   ├── sqltablesaves
│   │   │   │   ├── A_Base.sql
│   │   │   │   ├── B_createTable.sql
│   │   │   │   └── C_Save_2021_04_27_univcergy22.sql
│   │   │   └── starwars
│   │   │       ├── Acces.java
│   │   │       ├── Acteur.java
│   │   │       ├── DAOFilm.java
│   │   │       ├── Film.java
│   │   │       ├── Gentil.java
│   │   │       ├── Mechant.java
│   │   │       └── Personnage.java
│   │   ├── file.txt
│   │   └── fr
│   │       └── ldumay
│   │           ├── Main.java
│   │           └── others
│   │               ├── Console.java
│   │               └── DateConversion.java
│   └── test
├── 2020-java-modelisation-web
│   ├── build
│   │   ├── empty
│   │   ├── generated-sources
│   │   │   └── ap-source-output
│   │   └── web
│   │       ├── META-INF
│   │       │   └── MANIFEST.MF
│   │       ├── WEB-INF
│   │       │   ├── classes
│   │       │   │   ├── exos
│   │       │   │   │   └── starwars
│   │       │   │   │       └── Film$1.class
│   │       │   │   ├── exos\ copie
│   │       │   │   │   └── sqltablesaves
│   │       │   │   └── fr
│   │       │   │       ├── bases
│   │       │   │       │   ├── Console.class
│   │       │   │       │   ├── classes
│   │       │   │       │   └── sqltablesaves
│   │       │   │       ├── ldumay
│   │       │   │       │   └── others
│   │       │   │       ├── sqltablesaves
│   │       │   │       └── starwars
│   │       │   │           ├── controllers
│   │       │   │           │   ├── FilmListe.class
│   │       │   │           │   ├── FilmMiseAJour.class
│   │       │   │           │   ├── FilmResultatRequete.class
│   │       │   │           │   ├── FilmSaisi.class
│   │       │   │           │   └── FilmSuppression.class
│   │       │   │           ├── models
│   │       │   │           │   ├── Acces.class
│   │       │   │           │   ├── Acteur.class
│   │       │   │           │   ├── DAOFilm.class
│   │       │   │           │   ├── Film$1.class
│   │       │   │           │   ├── Film.class
│   │       │   │           │   ├── Gentil.class
│   │       │   │           │   ├── Mechant.class
│   │       │   │           │   └── Personnage.class
│   │       │   │           ├── servets
│   │       │   │           ├── sqltablesaves
│   │       │   │           └── views
│   │       │   ├── glassfish-web.xml
│   │       │   ├── img
│   │       │   │   ├── crayon.png
│   │       │   │   └── download.png
│   │       │   └── web.xml
│   │       ├── gfv3ee6.dpf
│   │       └── index.html
│   ├── build.xml
│   ├── dist
│   │   └── 2020-java-modelisation-web.war
│   ├── nbproject
│   │   ├── ant-deploy.xml
│   │   ├── build-impl.xml
│   │   ├── genfiles.properties
│   │   ├── private
│   │   │   ├── private.properties
│   │   │   └── private.xml
│   │   ├── project.properties
│   │   └── project.xml
│   ├── src
│   │   ├── conf
│   │   │   └── MANIFEST.MF
│   │   └── java
│   │       └── fr
│   │           ├── bases
│   │           │   └── Console.java
│   │           └── starwars
│   │               ├── controllers
│   │               │   ├── FilmListe.java
│   │               │   ├── FilmMiseAJour.java
│   │               │   ├── FilmResultatRequete.java
│   │               │   ├── FilmSaisi.java
│   │               │   └── FilmSuppression.java
│   │               ├── models
│   │               │   ├── Acces.java
│   │               │   ├── Acteur.java
│   │               │   ├── DAOFilm.java
│   │               │   ├── Film.java
│   │               │   ├── Gentil.java
│   │               │   ├── Mechant.java
│   │               │   └── Personnage.java
│   │               └── views
│   ├── test
│   └── web
│       ├── WEB-INF
│       │   ├── img
│       │   │   ├── crayon.png
│       │   │   └── download.png
│       │   └── web.xml
│       └── index.html
└── ReadMe.md

76 directories, 112 files
```
