/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

/**
 *
 * @author ldumay
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visite nouvelleVisite1 = new Visite();
        //-
        System.out.println("Nom du visiteur : "+nouvelleVisite1.nomDuVisiteur);
        System.out.println("Date de naissance du visiteur : "+nouvelleVisite1.dateDeNaissanceDuVisiteur);
        System.out.println("Note du visiteur : "+nouvelleVisite1.noteDuVisteur);
        
        Visite nouvelleVisite2 = new Visite("Georges","1990-10-10",15);
        //-
        System.out.println("\nNom du visiteur : "+nouvelleVisite2.nomDuVisiteur);
        System.out.println("Date de naissance du visiteur : "+nouvelleVisite2.dateDeNaissanceDuVisiteur);
        System.out.println("Note du visiteur : "+nouvelleVisite2.noteDuVisteur);
    }
    
}