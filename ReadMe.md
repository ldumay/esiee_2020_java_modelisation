# Projet d'apprentissage de Java JSE & JEE

## Arborescence du projet

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
├── 2020-java-modelisation-swing
│   ├── build
│   │   ├── built-jar.properties
│   │   ├── classes
│   │   │   ├── core
│   │   │   │   ├── abstracts
│   │   │   │   │   ├── Brass.class
│   │   │   │   │   ├── Percussion.class
│   │   │   │   │   ├── Stringed.class
│   │   │   │   │   ├── TableModelFilms.class
│   │   │   │   │   ├── Wind.class
│   │   │   │   │   └── Woodwind.class
│   │   │   │   ├── interfaces
│   │   │   │   │   └── Instrument.class
│   │   │   │   └── tools
│   │   │   │       ├── BDDConnector.class
│   │   │   │       ├── Calcul.class
│   │   │   │       ├── Fichiers.class
│   │   │   │       ├── MesDates.class
│   │   │   │       ├── Planning.class
│   │   │   │       └── Visite.class
│   │   │   ├── exos
│   │   │   │   ├── sqltablesaves
│   │   │   │   └── starwars
│   │   │   ├── fr
│   │   │   │   ├── koor
│   │   │   │   │   └── tp
│   │   │   │   │       └── swing
│   │   │   │   │           ├── MyEclipse.class
│   │   │   │   │           ├── MyWindow.class
│   │   │   │   │           ├── MyWindow2$1.class
│   │   │   │   │           ├── MyWindow2$2.class
│   │   │   │   │           ├── MyWindow2$3.class
│   │   │   │   │           ├── MyWindow2.class
│   │   │   │   │           ├── MyWindow2.form
│   │   │   │   │           ├── MyWindowBorderLayout.class
│   │   │   │   │           ├── MyWindowFlowLayout.class
│   │   │   │   │           ├── MyWindowGridLayout.class
│   │   │   │   │           └── listeners
│   │   │   │   │               ├── MyWindowListener1.class
│   │   │   │   │               ├── MyWindowListener2$1.class
│   │   │   │   │               ├── MyWindowListener2$2.class
│   │   │   │   │               ├── MyWindowListener2.class
│   │   │   │   │               ├── MyWindowListener3$1.class
│   │   │   │   │               ├── MyWindowListener3$2.class
│   │   │   │   │               └── MyWindowListener3.class
│   │   │   │   ├── ldumay
│   │   │   │   │   ├── main
│   │   │   │   │   │   ├── Main.class
│   │   │   │   │   │   ├── ViewLogin.class
│   │   │   │   │   │   └── ViewUsersList.class
│   │   │   │   │   └── others
│   │   │   │   │       ├── Console.class
│   │   │   │   │       └── DateConversion.class
│   │   │   │   └── others
│   │   │   └── starwars
│   │   │       ├── classes
│   │   │       │   ├── Acces.class
│   │   │       │   ├── Acteur.class
│   │   │       │   ├── Film$1.class
│   │   │       │   ├── Film.class
│   │   │       │   ├── Gentil.class
│   │   │       │   ├── Mechant.class
│   │   │       │   └── Personnage.class
│   │   │       ├── dao
│   │   │       │   ├── DAOFilm.class
│   │   │       │   └── DAOLogin.class
│   │   │       └── sqltablesaves
│   │   │           ├── A_Base.sql
│   │   │           ├── B_createTable.sql
│   │   │           └── C_Save_2021_04_27_univcergy22.sql
│   │   ├── empty
│   │   └── generated-sources
│   │       └── ap-source-output
│   ├── build.xml
│   ├── dist
│   │   ├── 2020-java-modelisation-swing.jar
│   │   └── README.TXT
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
│   │   │   │   ├── TableModelFilms.java
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
│   │   ├── fr
│   │   │   ├── koor
│   │   │   │   └── tp
│   │   │   │       └── swing
│   │   │   │           ├── MyEclipse.java
│   │   │   │           ├── MyWindow.java
│   │   │   │           ├── MyWindow2.form
│   │   │   │           ├── MyWindow2.java
│   │   │   │           ├── MyWindowBorderLayout.java
│   │   │   │           ├── MyWindowFlowLayout.java
│   │   │   │           ├── MyWindowGridLayout.java
│   │   │   │           └── listeners
│   │   │   │               ├── MyWindowListener1.java
│   │   │   │               ├── MyWindowListener2.java
│   │   │   │               └── MyWindowListener3.java
│   │   │   └── ldumay
│   │   │       ├── main
│   │   │       │   ├── Main.java
│   │   │       │   ├── ViewLogin.java
│   │   │       │   └── ViewUsersList.java
│   │   │       └── others
│   │   │           ├── Console.java
│   │   │           └── DateConversion.java
│   │   └── starwars
│   │       ├── classes
│   │       │   ├── Acces.java
│   │       │   ├── Acteur.java
│   │       │   ├── Film.java
│   │       │   ├── Gentil.java
│   │       │   ├── Mechant.java
│   │       │   └── Personnage.java
│   │       ├── dao
│   │       │   ├── DAOFilm.java
│   │       │   └── DAOLogin.java
│   │       └── sqltablesaves
│   │           ├── A_Base.sql
│   │           ├── B_createTable.sql
│   │           └── C_Save_2021_04_27_univcergy22.sql
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
│   │       │   │   └── fr
│   │       │   │       ├── bases
│   │       │   │       │   └── Console.class
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
│   │       │   │           └── views
│   │       │   ├── glassfish-web.xml
│   │       │   └── web.xml
│   │       ├── css
│   │       │   └── styles.css
│   │       ├── filmListe.jsp
│   │       ├── filmMiseAJour.jsp
│   │       ├── filmResultatRequete.jsp
│   │       ├── filmSaisi.jsp
│   │       ├── filmSuppression.jsp
│   │       ├── gfv3ee6.dpf
│   │       ├── img
│   │       │   ├── crayon.png
│   │       │   └── download.png
│   │       ├── includes
│   │       │   ├── foot.jsp
│   │       │   ├── head.jsp
│   │       │   └── header.jsp
│   │       ├── index.html
│   │       └── index.jsp
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
│   │               └── models
│   │                   ├── Acces.java
│   │                   ├── Acteur.java
│   │                   ├── DAOFilm.java
│   │                   ├── Film.java
│   │                   ├── Gentil.java
│   │                   ├── Mechant.java
│   │                   └── Personnage.java
│   ├── test
│   └── web
│       ├── WEB-INF
│       │   └── web.xml
│       ├── css
│       │   └── styles.css
│       ├── filmListe.jsp
│       ├── filmMiseAJour.jsp
│       ├── filmResultatRequete.jsp
│       ├── filmSaisi.jsp
│       ├── filmSuppression.jsp
│       ├── img
│       │   ├── crayon.png
│       │   └── download.png
│       ├── includes
│       │   ├── foot.jsp
│       │   ├── head.jsp
│       │   └── header.jsp
│       ├── index.html
│       └── index.jsp
└── ReadMe.md

117 directories, 230 files
```