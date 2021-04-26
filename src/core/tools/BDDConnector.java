/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

import exos.starwars.Film;
import fr.ldumay.others.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

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
    private String bddUrl = "jdbc:mysql://"+this.bddIP+":"+this.bddPort+"/"+this.bddName;

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
     * @param sqlQuery
     * @throws java.sql.SQLException
     */
    public void datasInsert(String sqlQuery) throws SQLException {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement datasAdd = (Statement) conn.createStatement();
            datasAdd.executeUpdate(sqlQuery);
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
     * Requète d'insertion dans une base de donnée
     * 
     * SystemPrint()
     * @param typeElement
     * @param tableBDD
     * @param elementArrayList
     * @throws java.sql.SQLException
     */
    public void datasInsert(String typeElement, String tableBDD, ArrayList elementArrayList) throws SQLException {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            String sql = "INSERT INTO "+tableBDD+" (`titre`, `anneeDeSortie`, `numeroEpisode`, `cout`, `recette`) VALUES ";
            if("Film".equals(typeElement)){
                int x = 1;
                String sqlElements = "";
                for (Iterator it = elementArrayList.iterator(); it.hasNext();) {
                    Film film = (Film) it.next();
                    sqlElements += "("
                            +"\""+film.getTitre()+"\""+","
                            +"\""+film.getAnneeDeSortie()+"\""+","
                            +film.getNumeroEpisode()+","
                            +film.getCout()+","
                            +film.getRecette()
                            +")";
                    if(x<elementArrayList.size()){ sqlElements += ","; }
                    x++;
                }
                sql += sqlElements;
                Console.print(sql);
                Statement datasAdd = (Statement) conn.createStatement();
                datasAdd.executeUpdate(sql);
                Console.print("->Insertion des datas dans la ["+tableBDD+"] OK");
            } else {
                Console.print("Type d'élément non reconnu.");
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
    
    /**
     * Requète d'insertion dans une base de donnée
     * 
     * SystemPrint()
     * @param typeElement
     * @param tableBDD
     * @param film
     * @throws java.sql.SQLException
     */
    public void datasInsert(String typeElement, String tableBDD, Film film) throws SQLException {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            String sql = "INSERT INTO "+tableBDD+" (`titre`, `anneeDeSortie`, `numeroEpisode`, `cout`, `recette`) VALUES ";
            if("Film".equals(typeElement)){
                String sqlElements = "("
                                +"\""+film.getTitre()+"\""+","
                                +"\""+film.getAnneeDeSortie()+"\""+","
                                +film.getNumeroEpisode()+","
                                +film.getCout()+","
                                +film.getRecette()
                                +")";
                sql += sqlElements;
                Console.print(sql);
                Statement datasAdd = (Statement) conn.createStatement();
                datasAdd.executeUpdate(sql);
                Console.print("->Insertion des datas dans la ["+tableBDD+"] OK");
            } else {
                Console.print("Type d'élément non reconnu.");
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

    /**
     * Requète de lecture dans une base de donnée
     * 
     * datasSelect()
     * @param typeElement
     * @param sqlQuery
     * @return resultDatas;
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public ArrayList datasSelect(String typeElement, String sqlQuery) throws ClassNotFoundException, SQLException {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement datasSelect = (Statement) conn.createStatement();
            ResultSet datas = datasSelect.executeQuery(sqlQuery);
            if("Film".equals(typeElement)){
                ArrayList resultDatas = new ArrayList();
                while (datas.next()) {
                    Film newFilm = new Film(datas.getInt(1), datas.getString(2), datas.getString(3), 
                            datas.getInt(4), datas.getDouble(5), datas.getDouble(6));
                    resultDatas.add(newFilm);
                }
                conn.close();
                return resultDatas;
            } else {
                while (datas.next()) {
                    Console.print("Id["+datas.getInt(1)+"]"
                        +" - titre : "+datas.getString(2)
                        +" - statut : "+datas.getString("statut")
                        +" - age : "+datas.getInt("age"));
                }
                conn.close();
                return null;
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
            return null;
        }
    }
    
    public void datasDelete(String table, int datasId){
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement datasAdd = (Statement) conn.createStatement();
            datasAdd.executeUpdate("DELETE FROM `"+table+"` WHERE id="+datasId+";");
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
