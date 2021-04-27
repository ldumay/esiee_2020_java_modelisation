/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bases.classes;

/**
 *
 * @author ldumay
 */

/**
 * Class - Gentil
 * <br>
 * <br>private String force;
 * <br>
 * <br>Constructor :
 * <br>- Gentil()
 * <br>- Gentil(boolean force)
 * <br>
 * <br>Functions :
 * <br>
 * <br>Basic getter :
 * <br>- getForce()
 * <br>
 * <br>Basic setter :
 * <br>- setForce()
 * <br>
 * <br>End.
 */
public class Gentil {
    
    private Boolean force;
    
    /**
     * Constructor
     * 
     * Gentil()
     */
    public Gentil(){}
    
    /**
     * Constructor
     * 
     * Gentil(boolean force)
     * @param force
     */
    public Gentil(boolean force){ this.force = force; }
    
    // The methods of basic getter below.
    public Boolean getForce(){ return this.force; }
    
    // The methods of basic setter below.
    public Boolean setForce(Boolean force){ return this.force; }
}
