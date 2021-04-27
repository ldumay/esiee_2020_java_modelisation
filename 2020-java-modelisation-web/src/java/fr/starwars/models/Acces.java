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
 * Class - Acces
 <br>
 * <br>Constructor :
 * <br>- Acces()
 * <br>
 * <br>Functions :
 * <br>
 * <br>
 * <br>Basic getter :
 * <br>- getId()
 * <br>- getPrenom()
 * <br>- getLogin()
 * <br>- getPassword()
 * <br>- getStatut()
 * <br>- getAge()
 * <br>
 * <br>Basic setter :
 * <br>- setId()
 * <br>- setPrenom()
 * <br>- setLogin()
 * <br>- setPassword()
 * <br>- setStatut()
 * <br>- setAge()
 * <br>
 * <br>End.
 */
public class Acces {
    
    private int id;
    private String prenom;
    private String login;
    private String password;
    private String statut;
    private int age;
    
    /**
     * Constructor
     * 
     * Acces()
     */
    public Acces(){}
    
    /**
     * Constructor
     * 
     * Acces()
     * @param id
     * @param prenom
     * @param login
     * @param password
     * @param statut
     * @param age
     */
    public Acces(int id, String prenom, String login, String password, String statut, int age){
        this.id = id;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.statut = statut;
        this.age = age;
    }

    // The methods of basic getter below.
    public int getId() { return id; }
    public String getPrenom() { return prenom; }
    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public String getStatut() { return statut; }
    public int getAge() { return age; }

    // The methods of basic setter below.
    public void setId(int id) { this.id = id; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setLogin(String login) { this.login = login; }
    public void setPassword(String password) { this.password = password; }
    public void setStatut(String statut) { this.statut = statut; }
    public void setAge(int age) { this.age = age; }
    
}
