/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import fr.ldumay.others.DateConversion;
import java.util.Date;
import java.util.Locale;
import tools.Calcul;
import tools.MesDates;
import tools.Planning;

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
        affiche("\nVisite "+x+" : "+v1);
        affiche("Nom du visiteur : "+v1.nomDuVisiteur);
        affiche("Date de naissance du visiteur : "+v1.dateDeNaissanceDuVisiteur);
        affiche("Note du visiteur : "+v1.noteDuVisteur);
        
        x++;
        
        Visite v2 = new Visite("Georges","1990-10-10",15);
        //-
        affiche("\nVisite "+x+" : "+v2);
        affiche("Nom du visiteur : "+v2.getNomDuVisiteur());
        affiche("Date de naissance du visiteur : "+v2.getDateDeNaissanceDuVisiteur());
        affiche("Note du visiteur : "+v2.getNoteDuVisteur());
        
        affiche("\ncharAt : "+v2.nomDuVisiteur.charAt(1));
        
        Integer a = 10;
        String b = a.toString();// integer a to string b
        Integer c = a.intValue();// integer a to integer c
        
        //-
        String date1 = "2021-05-10";
        //-
        MesDates mesDates = new MesDates();
        String date2 = mesDates.dateUStoFR(date1);
        String date3 = mesDates.dateFRtoUS(date2);
        affiche("\ndate start : "+date1);
        affiche("dateUStoFR : "+date2);
        affiche("dateFRtoUS : "+date3);
        //-
        DateConversion dateConversion = new DateConversion();
        affiche("\nconvert to US : "+dateConversion.dateConvertTypeDate(new Date(), Locale.FRANCE));
        affiche("convert to FR : "+dateConversion.dateConvertTypeDate(new Date(), Locale.ENGLISH));
        
        /*
        DateConversion d1 = new DateConversion();
        affiche("\n"+d1.dateConvert("22/04/2021", null, "US"));
        */
        
        Planning p1 = new Planning();
        affiche(p1.toString());
        Visite vA = new Visite("Georges DuPont", "1992/10/03", 20);
        Visite vB = new Visite("Georges DuPont", "2002/03/04", 15);
        Visite vC = new Visite("Georges DuPont", "1992/11/14", 14);
        Visite vD = new Visite("Georges DuPont", "1986/05/31", 18);
        p1.addVisite(vA);
        p1.addVisite(vB);
        p1.addVisite(vC);
        p1.addVisite(vD);
        affiche(p1.toString());
        
        Calcul calcul = new Calcul();
        calcul.setVarA(21);
        calcul.setVarB(35);
        affiche("\nA & B : "+calcul.toString());
        affiche("addition : "+calcul.addition());
        affiche("soustraction : "+calcul.soustraction());
        affiche("multiplication : "+calcul.multiplication());
        affiche("division : "+calcul.division());
        
    }
    
    public static void affiche(String text){
        System.out.println(text);
    }
    
}