/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars.dao;

import fr.ldumay.others.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import starwars.classes.Acces;
import starwars.classes.Avis;
import starwars.classes.Film;

/**
 *
 * @author ldumay
 */

/**
 * Class - DAOAvisForFilmByAcces
 <br>
 * <br>Constructor :
 * <br>- DAOAvisForFilmByAcces()
 <br>
 * <br>Functions :
 * <br>
 * <br>- DAOAvisForFilmByAcces.addAvisForFilmByAcces(Avis avis, Film film, Acces acces)
 * <br> |--> void
 * <br>
 * <br>- DAOAvisForFilmByAcces.deleteAvisForFilmByAcces(Avis avis, Film film, Acces acces)
 * <br> |--> void
 * <br>
 * <br>- DAOAvisForFilmByAcces.close()
 * <br> |--> void
 * <br>
 * <br>Basic getter :
 * <br>- getBddName()
 * <br>- getbddLogin()
 * <br>- getbddPassword()
 * <br>- getbddIP()
 * <br>- getbddPort()
 * <br>- getbddUrl()
 * <br>
 * <br>Basic setter :
 * <br>- setBddName()
 * <br>- setbddLogin()
 * <br>- setbddPassword()
 * <br>- setbddIP()
 * <br>- setbddPort()
 * <br>- setbddUrl()
 * <br>
 * <br>End.
 */
public class DAOAvisForFilmByAcces {
    
    //-Attributs de base
    private String bddName = "univcergy22";
    private String bddLogin = "root";
    private String bddPassword = "root";
    private String bddIP = "localhost";
    private String bddPort = "3306";
    private String bddUrl = "jdbc:mysql://"+this.bddIP+":"+this.bddPort+"/"+this.bddName;
    
    //-Attributs du driver JDBC
    private final String strClassName = "com.mysql.jdbc.Driver";
    private Statement statement;
    private Connection conn;
    
    /**
     * Constructor
     * 
     * DAOFilmEtAvis()
     */
    public DAOAvisForFilmByAcces(){
        try {
            Class.forName(this.strClassName);
            this.conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            this.statement = (Statement) conn.createStatement();
            Console.print("=> DAOAvisForFilmByAcces ready");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Requète d'ajout d'une liaison avis, film et accès dans une base de donnée
     * 
     * addAvis(Avis avis)
     * @param film
     * @param acces
     * @param avis
     * @throws java.sql.SQLException
     */
    public void addAvisForFilmByAcces(Avis avis, Film film, Acces acces) throws SQLException{
        if(acces==null){
            acces.setId(3);
            acces.setPrenom("Michel");
            acces.setLogin("lamere");
            acces.setPassword("sonchat");
            acces.setStatut("Admin");
            acces.setAge(69);
        } else { acces = acces; }
        //-
        try{
            String sql = "INSERT INTO `films_acces_avis` (`films_id`, `acces_id`, `avis_id`) VALUES ";
            String sqlElements = "("
                            +film.getId()+","
                            +acces.getId()+","
                            +avis.getId()
                            +")";
            sql += sqlElements;
            Console.print(sql);
            statement.executeUpdate(sql);
            Console.print("->Insertion des datas dans la [films_acces_avis] OK");
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Requète de suppression d'une liaison avis, film et accès dans une base de donnée
     * 
     * deleteAvis(Avis avis)
     * @param film
     * @param acces
     * @param avis
     * @throws java.sql.SQLException
     */
    public void deleteAvisForFilmByAcces(Avis avis, Film film, Acces acces) throws SQLException{
        try{
            String sql = "DELETE FROM `films_acces_avis` WHERE id="+avis.getId()+";";
            Console.print(sql);
            statement.executeUpdate(sql);
            Console.print("->Suppression de la ligne "+avis.getId()+" dans la table [films_acces_avis] OK");
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Fermeture de la connexion JDBC
     * 
     * close()
     * @throws java.sql.SQLException
     */
    public void close() throws SQLException{
        this.conn.close();
        Console.print("[La connexion à été fermée]");
    }
    
    // The methods of basic getter below.
    public String getBddName() {  return bddName;  }
    public String getBddLogin() { return bddLogin; }
    public String getBddPassword() { return bddPassword; }
    public String getBddIP() { return bddIP; }
    public String getBddPort() { return bddPort; }
    public String getBddUrl() { return bddUrl; }
    
    // The methods of basic setter below.
    public void setBddName(String bddName) { this.bddName = bddName; }
    public void setBddLogin(String bddLogin) { this.bddLogin = bddLogin; }
    public void setBddPassword(String bddPassword) { this.bddPassword = bddPassword; }
    public void setBddIP(String bddIP) { this.bddIP = bddIP; }
    public void setBddPort(String bddPort) { this.bddPort = bddPort; }
    public void setBddUrl(String bddUrl) {  this.bddUrl = bddUrl; }
    
}
