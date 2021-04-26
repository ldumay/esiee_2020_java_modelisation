/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos.starwars;

import java.util.ArrayList;


/**
 *
 * @author ldumay
 */

/**
 * Class - Acteur
 * <br>
 * <br>private int id
 * <br>private String nom
 * <br>private String prenom
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
    
    private int id;
    private String nom;
    private String prenom;
    private ArrayList<Personnage> duetPersonnages = new ArrayList(1);
    
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
     * @param id
     * @param nom
     * @param prenom
     */
    public Acteur(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Récupération du nombre de personnages
     * 
     * @return int
     */
    public int getNombrePersonnages(){ return this.duetPersonnages.size(); }
    
    // The methods of basic getter below.
    public int getId(){ return id; }
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    public ArrayList getDuetPersonnages() { return duetPersonnages; }

    // The methods of basic setter below.
    public void setId(int id){ this.id = id; }
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    public void setDuetPersonnages(ArrayList duetPersonnages) { this.duetPersonnages = duetPersonnages; }
    
    @Override
    public String toString(){
        return "\n[Acteur]"
            +"\n- id : "+this.getId()
            +"\n- nom de l'acteur : "+this.getNom()
            +"\n- prénom de l'acteur : "+this.getPrenom()
            +"\n- nombre de personnages : "+this.getNombrePersonnages();
    }
}