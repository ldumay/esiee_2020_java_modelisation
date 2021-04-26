/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import core.abstracts.Percussion;
import core.abstracts.Wind;
import core.abstracts.Woodwind;
import core.tools.BDDConnector;
import core.tools.Visite;
import fr.ldumay.others.DateConversion;
import java.util.Date;
import java.util.Locale;
import core.tools.Calcul;
import core.tools.Fichiers;
import core.tools.MesDates;
import core.tools.Planning;
import exos.starwars.Acteur;
import exos.starwars.DAOFilm;
import exos.starwars.Film;
import exos.starwars.Personnage;
import static fr.ldumay.others.Console.print;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author ldumay
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
        
        int x = 1;
        
        Visite v1 = new Visite();
        //-
        print("\nVisite "+x+" : "+v1);
        print("Nom du visiteur : "+v1.nomDuVisiteur);
        print("Date de naissance du visiteur : "+v1.dateDeNaissanceDuVisiteur);
        print("Note du visiteur : "+v1.noteDuVisteur);
        
        x++;
        
        Visite v2 = new Visite("Georges","1990-10-10",15);
        //-
        print("\nVisite "+x+" : "+v2);
        print("Nom du visiteur : "+v2.getNomDuVisiteur());
        print("Date de naissance du visiteur : "+v2.getDateDeNaissanceDuVisiteur());
        print("Note du visiteur : "+v2.getNoteDuVisteur());
        
        print("\ncharAt : "+v2.nomDuVisiteur.charAt(1));
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        Integer a = 10;
        String b = a.toString();// integer a to string b
        Integer c = a.intValue();// integer a to integer c
        
        //-
        String date1 = "2021-05-10";
        //-
        MesDates mesDates = new MesDates();
        String date2 = mesDates.dateUStoFR(date1);
        String date3 = mesDates.dateFRtoUS(date2);
        print("\ndate start : "+date1);
        print("dateUStoFR : "+date2);
        print("dateFRtoUS : "+date3);
        //-
        DateConversion dateConversion = new DateConversion();
        print("\nconvert to US : "+dateConversion.dateConvertTypeDate(new Date(), Locale.FRANCE));
        print("convert to FR : "+dateConversion.dateConvertTypeDate(new Date(), Locale.ENGLISH));
        
        /*
        DateConversion d1 = new DateConversion();
        print("\n"+d1.dateConvert("22/04/2021", null, "US"));
        */
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        Planning p1 = new Planning();
        print(p1.toString());
        Visite vA = new Visite("Georges DuPont", "1992/10/03", 20);
        Visite vB = new Visite("Georges DuPont", "2002/03/04", 15);
        Visite vC = new Visite("Georges DuPont", "1992/11/14", 14);
        Visite vD = new Visite("Georges DuPont", "1986/05/31", 18);
        p1.addVisite(vA);
        p1.addVisite(vB);
        p1.addVisite(vC);
        p1.addVisite(vD);
        print(p1.toString());
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        Calcul calcul = new Calcul();
        calcul.setVarA(21);
        calcul.setVarB(35);
        print("\nA & B : "+calcul.toString());
        print("addition : "+calcul.addition());
        print("soustraction : "+calcul.soustraction());
        print("multiplication : "+calcul.multiplication());
        print("division : "+calcul.division());
        
        print("\nWind : ");
        Wind wind = new Wind();
        wind.play();
        print("Percussion : ");
        Percussion percussion = new Percussion();
        percussion.play();
        print("Woodwind : ");
        Woodwind woodwind = new Woodwind();
        woodwind.play();
        
        print("\nFichier :");
        Fichiers fichier = new Fichiers();
        print(fichier.getContentFile());
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        print("\nListes Chaînées & itération : ");
        //-
        LinkedList<String> listeChainee = new LinkedList();
        listeChainee.add("Brian");
        listeChainee.addLast("Edouard");
        listeChainee.add("Paul");
        listeChainee.addFirst("Pierre");
        for(String element : listeChainee){
            print("- "+element);
        }
        print("listechainee - size : "+listeChainee.size());
        //-
        listeChainee.clear();
        listeChainee.add("Georges");
        listeChainee.add("Claire");
        listeChainee.addFirst("Pierre");
        for(String element : listeChainee){
            print("- "+element);
        }
        print("listechainee - size : "+listeChainee.size());
        //-
        ListIterator<String> listeChaineeIterator = listeChainee.listIterator();
        if(listeChaineeIterator.hasNext()){
            print("-> toString fo next element : "+listeChaineeIterator.next());
        }
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        print("\nStack : ");
        //-
        Stack listeLIFO = new Stack();
        listeLIFO.push("Vélo");
        listeLIFO.push("Voiture");
        listeLIFO.push("Bus");
        for(Object element : listeLIFO){
            print("- "+element);
        }
        print("Peek element : "+listeChainee.peek());
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        print("\nStar wars : ");
        
        Film filmA = new Film(0, "Star wars I","1977", 1, 1234.123, 6443.123);
        Film filmB = new Film(0, "Star wars II","1980", 2, 1234.123, 6443.123);
        Film filmC = new Film(0, "Star wars III","1983", 3, 1234.123, 6443.123);
        //Film filmD = new Film(true);
        
        ArrayList<Film> films = new ArrayList();
        films.add(filmA);
        films.add(filmB);
        films.add(filmC);
        //films.add(filmD);
        
        int y = 1;
        for(Film film : films){
            print("[Film "+y+"]"+film.toString());
            y++;
        }
        
        Personnage persoA = new Personnage(0, "Skywalker", "Anakin");
        Personnage persoB = new Personnage(0, "Skywalker", "Luke");
        Personnage persoC = new Personnage(0, "Skywalker", "Shmi");
        Personnage persoD = new Personnage(0, "Skywalker", "Ben");
        /*
        Personnage persoE = new Personnage("Skywalker", "Nat");
        Personnage persoF = new Personnage("Skywalker", "Kol");
        Personnage persoG = new Personnage("Skywalker", "Cade");
        Personnage persoH = new Personnage("Solo", "Allana");
        Personnage persoI = new Personnage("Solo", "Anakin");
        Personnage persoJ = new Personnage("Solo", "Ania");
        Personnage persoK = new Personnage("Solo", "Jacen");
        Personnage persoL = new Personnage("Solo", "Jaina");
        */
        
        Acteur acteur1 = new Acteur(0, "Ford", "Harrison");
        Acteur acteur2 = new Acteur(0, "Hamill", "Mark");
        Acteur acteur3 = new Acteur(0, "Fisher", "Carrie");
        Acteur acteur4 = new Acteur(0, "Guinness", "Alec");
        
        ArrayList<Personnage> personnagesActeurA = new ArrayList(1);
        personnagesActeurA.add(persoA);
        personnagesActeurA.add(persoB);
        acteur1.setDuetPersonnages(personnagesActeurA);
        //print("\n[Acteur 1] "+acteur1.toString());
        ArrayList<Personnage> personnagesActeurB = new ArrayList(1);
        personnagesActeurB.add(persoC);
        personnagesActeurB.add(persoD);
        acteur2.setDuetPersonnages(personnagesActeurB);
        //print("\n[Acteur 2] "+acteur2.toString());
        ArrayList<Personnage> personnagesActeurC = new ArrayList(1);
        personnagesActeurC.add(persoC);
        personnagesActeurC.add(persoD);
        acteur3.setDuetPersonnages(personnagesActeurC);
        //print("\n[Acteur 3] "+acteur3.toString());
        ArrayList<Personnage> personnagesActeurD = new ArrayList(1);
        personnagesActeurD.add(persoC);
        personnagesActeurD.add(persoD);
        acteur4.setDuetPersonnages(personnagesActeurD);
        //print("\n[Acteur 4] "+acteur4.toString());
        
        ArrayList<Acteur> acteursList1 = new ArrayList();
        acteursList1.add(acteur1);
        acteursList1.add(acteur2);
        acteursList1.add(acteur3);
        acteursList1.add(acteur4);
        filmA.setActeurs(acteursList1);
        print("\n"+filmA.toString());
        
        boolean isBefore = filmA.isBefore("2020");
        print("\n isBefore : "+isBefore);
        
        print("\n"+filmA.getActeurs());
        filmA.tri();
        print("\n"+filmA.getActeurs());
        
        print("\nHashMap Dico");
        HashMap<String,Film> dicoFilms = new HashMap();
        dicoFilms.put(filmA.getAnneeDeSortie(), filmA);
        dicoFilms.put(filmB.getAnneeDeSortie(), filmB);
        dicoFilms.put(filmC.getAnneeDeSortie(), filmC);
        //dicoFilms.put(filmD.getAnneeDeSortie(), filmD);
        
        makeBackUp(dicoFilms);
        
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        print("\nStar wars [Part 2] : ");
        
        BDDConnector connect = new BDDConnector();
        print("\nAcces : ");
        connect.datasSelect(null, "SELECT * FROM Acces");
        //-
        Film filmE = new Film(0, "Batman","1989", 1, 1234.123, 6443.123);
        connect.datasInsert("Film", "films", filmE);
        //-
        Film filmG = new Film(0, "Batman","1989", 1, 1234.123, 6443.123);
        connect.datasInsert("Film", "films", filmG);
        //-
        /*
        Scanner scan = new Scanner(System.in);
        print("- (id) id du film à supprimer : ");
        int idFilmSuppr = Integer.parseInt(scan.nextLine());
        connect.datasDelete("films", idFilmSuppr);
        */
        //-
        connect.datasInsert("Film", "films", films);
        //-
        connect.datasUpdate("films", 7, "Jumanji");
        connect.datasUpdate("films", 6, "Jumanji 2");
        connect.datasUpdate("films", 4, "Harry Potter");
        connect.datasUpdate("films", 11, "Godzilla");
        //-
        print("\nFilms : ");
        ArrayList filmsInBDD = connect.datasSelect("Film", "SELECT * FROM films");
        for (Iterator it = filmsInBDD.iterator(); it.hasNext();) {
            Film film = (Film) it.next();
            print(film.toString());
        }
        
        DAOFilm daoFilm = new DAOFilm();
        Film filmH = new Film(0, "Là-Haut","2010", 1, 1234.123, 6443.123);
        daoFilm.addFilm("films", filmH);
        daoFilm.listReadingConsole("SELECT * FROM films");
        daoFilm.deleteFilm("films", 67);
        ArrayList daoFilmList = new ArrayList();
        daoFilmList.addAll(daoFilm.listReadingArrayList("SELECT * FROM films"));
        print("\n[daoFilmList] : \n"+daoFilmList);
        daoFilm.close();
        
        /*
        print("\nActeurs : ");
        connect.datasSelect("nActeur", "SELECT * FROM Acteurs");
        print("\nPersonnages : ");
        connect.datasSelect("Personnage", "SELECT * FROM Personnages");
         */
        
    }
    
    public static void makeBackUp(HashMap dicoFilms){
        Set dicoFilmsSetIterator = dicoFilms.entrySet();
        Iterator dicoFilmsList = dicoFilmsSetIterator.iterator();
        while(dicoFilmsList.hasNext()) {
            Map.Entry film = (Map.Entry)dicoFilmsList.next();
            String filmKey = (String) film.getKey();
            Film filmValue = (Film) film.getValue();
            String filmTitre = filmValue.getTitre();
            String filmBenefice = filmValue.calculBenefice().get(1).toString();
            print(""+filmKey+" - "+filmTitre+" - "+filmBenefice);
        }
    }
    
}
