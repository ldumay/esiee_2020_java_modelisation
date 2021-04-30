/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars.dao;

import fr.ldumay.others.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import starwars.classes.Acces;
import starwars.classes.Film;

/**
 *
 * @author ldumay
 */

/**
 * Class - DAOFilm
 <br>
 * <br>Constructor :
 * <br>- DAOFilm()
 * <br>
 * <br>Functions :
 * <br>
 * <br>- DAOFilm.checkPassword(String login, String Password)
 <br> |--> void
 * <br>
 * <br>- DAOFilm.close()
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
public class DAOLogin {
    
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
     * DAOFilm()
     */
    public DAOLogin(){
        try {
            Class.forName(this.strClassName);
            this.conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            this.statement = (Statement) conn.createStatement();
            Console.print("=> DAOFilm ready");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Requète de lecture des films dans une base de donnée
     * 
     * checkPassword(String login, String password)
     * @param login
     * @param password
     * @return Acces
     * @throws java.sql.SQLException
     */
    public Acces checkPassword(String login, String password) throws SQLException{
        Acces accesSelectionne = null;
        try{
            ResultSet datas = this.statement.executeQuery("SELECT * FROM acces");
            ArrayList resultDatas = new ArrayList();
                while (datas.next()) {
                    Acces newAcces = new Acces(datas.getInt(1), datas.getString(2), datas.getString(3), 
                            datas.getString(4), datas.getString(5), datas.getInt(6));
                    resultDatas.add(newAcces);
                    if( (newAcces.getLogin() == null ? login == null : newAcces.getLogin().equals(login))
                        && (newAcces.getPassword() == null ? password == null : newAcces.getPassword().equals(password)) ){
                        accesSelectionne = newAcces;
                        Console.print("->Correspondance du login et mdp OK");
                    }
                }
                conn.close();
                return accesSelectionne;
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
            return accesSelectionne;
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
