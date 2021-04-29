/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.others;

import java.util.Scanner;

/**
 *
 * @author ldumay
 */

/**
 * Class - Console
 <br>
 * <br>Constructor :
 * <br>- Console()
 <br>
 * <br>Functions :
 * <br>- Console.print(String text)
 <br>  |--> void
 * <br>
 * <br>End.
 */
public class Console {
    
    /**
     * Constructor
     * 
     * SystemPrint()
     */
    public Console(){}
    
    /**
     * print()
     * 
     * print(String text)
     * @param text
     */
    public static void print(String text){
        System.out.println(text);
    }
    
    public static Object input(String title){
        Scanner inputString = new Scanner(System.in);
        print(title+" : ");
        Object data =  inputString.next();
        return data;
    }
    
}
