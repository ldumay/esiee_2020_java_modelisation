/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import java.util.Date;
import java.util.Locale;

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
        affiche("\nconvert to US : "+v1.convert(new Date(), Locale.FRANCE));
        affiche("\nconvert to FR : "+v1.convert(new Date(), Locale.ENGLISH));
        
        /*
        DateConversion d1 = new DateConversion();
        affiche("\n"+d1.dateConvert("22/04/2021", null, "US"));
        */
        
    }
    
    public static void affiche(String text){
        System.out.println(text);
    }
    
}