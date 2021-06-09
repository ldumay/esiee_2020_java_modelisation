/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.starwars.dao;

import fr.ldumay.others.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import fr.starwars.models.Acces;

/**
 *
 * @author ldumay
 */

/**
 * Class - DAOUser
 * <br>
 * <br>Constructor :
 * <br>- DAOUser()
 * <br>
 * <br>Functions :
 * <br>
 * <br>- DAOUser.listReading()
 * <br> |--> void
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
public class DAOUser {
    
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
    public DAOUser(){
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
     * listReading()
     * @return Acces
     * @throws java.sql.SQLException
     */
    public ArrayList listReading() throws SQLException{
        try{
            ResultSet datas = this.statement.executeQuery("SELECT * FROM acces");
            ArrayList resultDatas = new ArrayList();
                while (datas.next()) {
                    Acces newAcces = new Acces(datas.getInt(1), datas.getString(2), datas.getString(3), 
                            datas.getString(4), datas.getString(5), datas.getInt(6));
                    resultDatas.add(newAcces);
                    Console.print("->Liste OK");
                }
                conn.close();
                return resultDatas;
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Requète d'ajout d'un film dans une base de donnée
     * 
     * addFilm(Acces acces)
     * @param acces
     * @throws java.sql.SQLException
     */
    public void addAcces(Acces acces) throws SQLException{
        try{
            String sql = "INSERT INTO `acces` (`prenom`, `login`, `password`, `statut`, `age`) VALUES ";
            String sqlElements = "("
                            +"\""+acces.getPrenom()+"\""+","
                            +"\""+acces.getLogin()+"\""+","
                            +"\""+acces.getPassword()+"\""+","
                            +"\""+acces.getStatut()+"\""+","
                            +acces.getAge()
                            +")";
            sql += sqlElements;
            Console.print(sql);
            statement.executeUpdate(sql);
            Console.print("->Insertion des datas dans la [acces] OK");
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
