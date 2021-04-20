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
public class Visite {

    String name = "Brian";
    String date = "2020-10-05";
    int noteMaths = 20;

    public Visite(){}
    
    public Visite(String name, String date, int noteMaths) {
        this.name = name;
        this.date = date;
        this.noteMaths = noteMaths;
    }
}
