/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.starwars.models;

/**
 *
 * @author ldumay
 */

/**
 * Class - Mechant
 * <br>
 * <br>private String obscure;
 * <br>
 * <br>Constructor :
 * <br>- Mechant()
 * <br>- Mechant(boolean obscure)
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
public class Mechant {
    
    private Boolean obscure;
    
    /**
     * Constructor
     * 
     * Mechant()
     */
    public Mechant(){}
    
    /**
     * Constructor
     * 
     * Mechant(boolean obscure)
     * @param obscure
     */
    public Mechant(boolean obscure){ this.obscure = obscure; }
    
    // The methods of basic getter below.
    public Boolean getObscure(){ return this.obscure; }
    
    // The methods of basic setter below.
    public Boolean setObscure(Boolean force){ return this.obscure; }
}

