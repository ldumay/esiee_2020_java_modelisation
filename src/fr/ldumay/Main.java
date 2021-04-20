/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

/**
 *
 * @author mtl
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visite nouvelleVisite = new Visite();
        //-
        System.out.println("visite A - date : "+nouvelleVisite.date);
        System.out.println("visite A - name : "+nouvelleVisite.name);
        System.out.println("visite A - note de Maths : "+nouvelleVisite.noteMaths);
    }
    
}