/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.abstracts;

import core.interfaces.Instrument;
import fr.ldumay.others.LogPrint;

/**
 *
 * @author ldumay
 */
public class Wind implements Instrument{
    
    @Override
    public void play(){ LogPrint.affiche("Fiouuuuuuu"); }
    
    @Override
    public String what(){ return null; }
    
    @Override
    public void adjust(){}
}
