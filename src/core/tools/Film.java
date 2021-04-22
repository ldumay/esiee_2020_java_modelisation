/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

/**
 *
 * @author ldumay
 */

/**
 * Class - Film
 * <br>
 * <br>private String titre;
 * <br>private String anneeDeSortie;
 * <br>private String numeroEpisode;
 * <br>private String cout;
 * <br>private String Recette;
 * <br>
 * <br>Constructor :
 * <br>- Film()
 * <br>- Film(String titre, String anneeDeSortie, String numeroEpisode, String cout, String recette)
 * <br>
 * <br>Functions :
 * <br>
 * <br>Basic getter :
 * <br>- getTitre()
 * <br>- getAnneeDeSortie()
 * <br>- getNumeroEpisode()
 * <br>- getCout()
 * <br>- getRecette()
 * <br>
 * <br>Basic setter :
 * <br>- setTitre()
 * <br>- setAnneeDeSortie()
 * <br>- setNumeroEpisode()
 * <br>- setCout()
 * <br>- setRecette()
 * <br>
 * <br>End.
 */
public class Film {

    private String titre;
    private String anneeDeSortie;
    private String numeroEpisode;
    private double cout;
    private double recette;
    
    /**
     * Constructor
     * 
     * Film()
     */
    public Film() {}
    
    /**
     * Constructor
     * 
     * Film(String titre, String anneeDeSortie, String numeroEpisode, String cout, String recette)
     * @param titre
     * @param anneeDeSortie
     * @param numeroEpisode
     * @param cout
     * @param recette
     */
    public Film(String titre, String anneeDeSortie, String numeroEpisode, double cout, double recette) { this.titre = titre;
        this.anneeDeSortie = anneeDeSortie;
        this.numeroEpisode = numeroEpisode;
        this.cout = cout;
        this.recette = recette;
    }

    // The methods of basic getter below.
    public String getTitre() {
        return titre;
    }
    public String getAnneeDeSortie() { return anneeDeSortie; }
    public String getNumeroEpisode() { return numeroEpisode; }
    public double getCout() { return cout; }
    public double getRecette() { return recette; }

    // The methods of basic setter below.
    public void setTitre(String titre) { this.titre = titre; }
    public void setAnneeDeSortie(String anneeDeSortie) { this.anneeDeSortie = anneeDeSortie; }
    public void setNumeroEpisode(String numeroEpisode) { this.numeroEpisode = numeroEpisode; }
    public void setCout(double cout) { this.cout = cout;}
    public void setRecette(double recette) { this.recette = recette; }
    
    @Override
    public String toString(){
        return "Film : "+this.titre+" "+this.anneeDeSortie+" "+this.numeroEpisode+" "+this.cout+" "+this.recette;
    }
}
