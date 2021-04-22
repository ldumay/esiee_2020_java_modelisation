/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import core.abstracts.Percussion;
import core.abstracts.Wind;
import core.abstracts.Woodwind;
import core.tools.Visite;
import fr.ldumay.others.DateConversion;
import fr.ldumay.others.Console;
import java.util.Date;
import java.util.Locale;
import core.tools.Calcul;
import core.tools.Fichiers;
import core.tools.MesDates;
import core.tools.Planning;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author ldumay
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 1;
        
        Visite v1 = new Visite();
        //-
        Console.print("\nVisite "+x+" : "+v1);
        Console.print("Nom du visiteur : "+v1.nomDuVisiteur);
        Console.print("Date de naissance du visiteur : "+v1.dateDeNaissanceDuVisiteur);
        Console.print("Note du visiteur : "+v1.noteDuVisteur);
        
        x++;
        
        Visite v2 = new Visite("Georges","1990-10-10",15);
        //-
        Console.print("\nVisite "+x+" : "+v2);
        Console.print("Nom du visiteur : "+v2.getNomDuVisiteur());
        Console.print("Date de naissance du visiteur : "+v2.getDateDeNaissanceDuVisiteur());
        Console.print("Note du visiteur : "+v2.getNoteDuVisteur());
        
        Console.print("\ncharAt : "+v2.nomDuVisiteur.charAt(1));
        
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
        Console.print("\ndate start : "+date1);
        Console.print("dateUStoFR : "+date2);
        Console.print("dateFRtoUS : "+date3);
        //-
        DateConversion dateConversion = new DateConversion();
        Console.print("\nconvert to US : "+dateConversion.dateConvertTypeDate(new Date(), Locale.FRANCE));
        Console.print("convert to FR : "+dateConversion.dateConvertTypeDate(new Date(), Locale.ENGLISH));
        
        /*
        DateConversion d1 = new DateConversion();
        Console.print("\n"+d1.dateConvert("22/04/2021", null, "US"));
        */
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        Planning p1 = new Planning();
        Console.print(p1.toString());
        Visite vA = new Visite("Georges DuPont", "1992/10/03", 20);
        Visite vB = new Visite("Georges DuPont", "2002/03/04", 15);
        Visite vC = new Visite("Georges DuPont", "1992/11/14", 14);
        Visite vD = new Visite("Georges DuPont", "1986/05/31", 18);
        p1.addVisite(vA);
        p1.addVisite(vB);
        p1.addVisite(vC);
        p1.addVisite(vD);
        Console.print(p1.toString());
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        Calcul calcul = new Calcul();
        calcul.setVarA(21);
        calcul.setVarB(35);
        Console.print("\nA & B : "+calcul.toString());
        Console.print("addition : "+calcul.addition());
        Console.print("soustraction : "+calcul.soustraction());
        Console.print("multiplication : "+calcul.multiplication());
        Console.print("division : "+calcul.division());
        
        Console.print("\nWind : ");
        Wind wind = new Wind();
        wind.play();
        Console.print("Percussion : ");
        Percussion percussion = new Percussion();
        percussion.play();
        Console.print("Woodwind : ");
        Woodwind woodwind = new Woodwind();
        woodwind.play();
        
        Console.print("\nFichier :");
        Fichiers fichier = new Fichiers();
        Console.print(fichier.getContentFile());
        
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        
        Console.print("\nListes Chaînées & itération : ");
        //-
        LinkedList<String> listeChainee = new LinkedList();
        listeChainee.add("Brian");
        listeChainee.addLast("Edouard");
        listeChainee.add("Paul");
        listeChainee.addFirst("Pierre");
        for(String element : listeChainee){
            Console.print("- "+element);
        }
        Console.print("listechainee - size : "+listeChainee.size());
        //-
        listeChainee.clear();
        listeChainee.add("Georges");
        listeChainee.add("Claire");
        listeChainee.addFirst("Pierre");
        for(String element : listeChainee){
            Console.print("- "+element);
        }
        Console.print("listechainee - size : "+listeChainee.size());
        //-
        ListIterator<String> listeChaineeIterator = listeChainee.listIterator();
        if(listeChaineeIterator.hasNext()){
            Console.print("-> toString fo next element : "+listeChaineeIterator.next());
        }

    }
    
}
