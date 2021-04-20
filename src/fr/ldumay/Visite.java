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
public class Visite {

    String nomDuVisiteur = "Brian";
    String dateDeNaissanceDuVisiteur = "1987-10-05";
    int noteDuVisteur = 20;

    public Visite(){}
    
    public Visite(
            String nomDuVisiteur,
            String dateDeNaissanceDuVisiteur,
            int noteDuVisteur) {
        this.nomDuVisiteur = nomDuVisiteur;
        this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur;
        this.noteDuVisteur = noteDuVisteur;
    }
}