/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ldumay
 */

/**
 * Class - BDDConnector
 <br>
 * <br>Constructor :
 * <br>- BDDConnector()
 <br>
 * <br>Functions :
 * <br>- Console.datasInsert(data)
 * <br> |--> void
 * <br>
 * <br>- Console.datasSelect()
 * <br>  |--> void
 * <br>
 * <br>End.
 */
public class BDDConnector {

    private final String strClassName = "com.mysql.jdbc.Driver";
    private String bddName = "univcergy22";
    private String bddLogin = "root";
    private String bddPassword = "root";
    private String bddIP = "localhost";
    private String bddPort = "3306";
    public String bddUrl = "jdbc:mysql://"+this.bddIP+":"+this.bddPort+"/"+this.bddName;

    /**
     * Constructor
     * 
     * BDDConnector()
     */
    public BDDConnector() {}

    /**
     * Constructor
     * 
     * BDDConnector(String bddName, String bddLogin, String bddPassword, String bddIP, String bddPort)
     * @param bddName
     * @param bddLogin
     * @param bddPassword
     * @param bddIP
     * @param bddPort
     */
    public BDDConnector(String bddName, String bddLogin, String bddPassword, String bddIP, String bddPort) {
        this.bddName = bddName;
        this.bddLogin = bddLogin;
        this.bddPassword = bddPassword;
        this.bddIP = bddIP;
        this.bddPort = bddPort;
    }

    /**
     * Requète d'insertion dans une base de donnée
     * 
     * SystemPrint()
     * @throws java.sql.SQLException
     */
    public void datasInsert(String sqlQuery) throws SQLException {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement stAddUser = (Statement) conn.createStatement();
            stAddUser.executeUpdate(sqlQuery);
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }

    /**
     * Requète de lecture dans une base de donnée
     * 
     * datasSelect()
     */
    public void datasSelect() {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement stUsers = (Statement) conn.createStatement();
            ResultSet rsUsers = stUsers.executeQuery("select * from Acces");
            while (rsUsers.next()) {
                System.out.print("Id[" + rsUsers.getInt(1) + "]"
                        + rsUsers.getString(2)
                        + "[" + rsUsers.getString("statut") + "] "
                        + rsUsers.getInt("age") + "\n");
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }

}
