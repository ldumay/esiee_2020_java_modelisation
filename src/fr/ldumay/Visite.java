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
    
    public Visite(String nomDuVisiteur, String dateDeNaissanceDuVisiteur, int noteDuVisteur) {
        this.nomDuVisiteur = nomDuVisiteur;
        this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur;
        this.noteDuVisteur = noteDuVisteur;
    }

    public String getNomDuVisiteur() { return nomDuVisiteur; }
    public String getDateDeNaissanceDuVisiteur() { return dateDeNaissanceDuVisiteur; }
    public int getNoteDuVisteur() { return noteDuVisteur; }
    
    public void setNomDuVisiteur(String nomDuVisiteur) { this.nomDuVisiteur = nomDuVisiteur; }
    public void setDateDeNaissanceDuVisiteur(String dateDeNaissanceDuVisiteur) { this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur; }
    public void setNoteDuVisteur(int noteDuVisteur) { this.noteDuVisteur = noteDuVisteur; }
    
    @Override
    public String toString(){ return this.nomDuVisiteur+this.dateDeNaissanceDuVisiteur+this.noteDuVisteur; }
}