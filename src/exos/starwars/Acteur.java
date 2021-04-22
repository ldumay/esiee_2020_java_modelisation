/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos.starwars;


/**
 *
 * @author ldumay
 */

/**
 * Class - Acteur
 * <br>
 * <br>private String nom;
 * <br>private String prenom;
 * <br>
 * <br>Constructor :
 * <br>- Personnage()
 * <br>- Personnage(String nom, String prenom)
 * <br>
 * <br>Functions :
 * <br>
 * <br>Basic getter :
 * <br>- getNom()
 * <br>- getPrenom()
 * <br>
 * <br>Basic setter :
 * <br>- setNom()
 * <br>- setPrenom()
 * <br>
 * <br>End.
 */
public class Acteur {
    
    private String nom;
    private String prenom;
    
    /**
     * Constructor
     * 
     * Personnage()
     */
    public Acteur(){}
    
    /**
     * Constructor
     * 
     * Personnage(String nom, String prenom)
     * @param nom
     * @param prenom
     */
    public Acteur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    // The methods of basic getter below.
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    
    // The methods of basic setter below.
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    
    @Override
    public String toString(){
        return "Acteur : "+this.nom+" "+this.prenom;
    }
}