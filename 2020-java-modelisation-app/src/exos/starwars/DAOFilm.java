/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos.starwars;

import fr.ldumay.others.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
 * <br>- DAOFilm.listReading(String typeElement, String sqlQuery)
 * <br> |--> void
 * <br>
 * <br>- DAOFilm.addFilm(String tableBDD, Film film)
 * <br> |--> void
 * <br>
 * <br>- DAOFilm.deleteFilm(String tableBDD, int datasId)
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
public class DAOFilm {
    
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
    public DAOFilm(){
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
     * listReadingConsole(String sqlQuery)
     * @param sqlQuery
     * @throws java.sql.SQLException
     */
    public void listReadingConsole(String sqlQuery) throws SQLException{
        try{
            ResultSet datas = this.statement.executeQuery(sqlQuery);
            Console.print("->Sélection des datas OK");
            while (datas.next()) {
                Console.print("Film :"
                        +"\n- id du film : "+datas.getInt(1)
                        +"\n- titre du film : "+datas.getString(2)
                        +"\n- année de sortie : "+datas.getString(3)
                        +"\n- numéro de l'épisode du film : "+datas.getInt(4)
                        +"\n- coût du film : "+datas.getDouble(5)
                        +"\n- recette du film : "+datas.getDouble(6)
                        );
            }
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Requète de lecture des films dans une base de donnée
     * 
     * listReadingArrayList(String sqlQuery)
     * @param sqlQuery
     * @return 
     * @throws java.sql.SQLException
     */
    public ArrayList listReadingArrayList(String sqlQuery) throws SQLException{
        try{
            ResultSet datas = this.statement.executeQuery(sqlQuery);
            ArrayList resultDatas = new ArrayList();
                while (datas.next()) {
                    Film newFilm = new Film(datas.getInt(1), datas.getString(2), datas.getString(3), 
                            datas.getInt(4), datas.getDouble(5), datas.getDouble(6));
                    resultDatas.add(newFilm);
                }
                conn.close();
                Console.print("->Sélection des datas OK");
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
     * addFilm(String tableBDD, Film film)
     * @param tableBDD
     * @param film
     * @throws java.sql.SQLException
     */
    public void addFilm(String tableBDD, Film film) throws SQLException{
        try{
            String sql = "INSERT INTO "+tableBDD+" (`titre`, `anneeDeSortie`, `numeroEpisode`, `cout`, `recette`) VALUES ";
            String sqlElements = "("
                            +"\""+film.getTitre()+"\""+","
                            +"\""+film.getAnneeDeSortie()+"\""+","
                            +film.getNumeroEpisode()+","
                            +film.getCout()+","
                            +film.getRecette()
                            +")";
            sql += sqlElements;
            Console.print(sql);
            statement.executeUpdate(sql);
            Console.print("->Insertion des datas dans la ["+tableBDD+"] OK");
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Requète de suppression d'un film dans une base de donnée
     * 
     * datasDelete(String table, int datasId)
     * @param tableBDD
     * @param datasId
     * @throws java.sql.SQLException
     */
    public void deleteFilm(String tableBDD, int datasId) throws SQLException{
        try{
            String sql = "DELETE FROM "+tableBDD+" WHERE id="+datasId+";";
            Console.print(sql);
            statement.executeUpdate(sql);
            Console.print("->Suppression de la ligne "+datasId+" dans la table ["+tableBDD+"] OK");
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }
    
    /**
     * Requète de suppression d'un film dans une base de donnée
     * 
     * datasDelete(String table, int datasId)
     * @param tableBDD
     * @param film
     * @throws java.sql.SQLException
     */
    public void deleteFilm(String tableBDD, Film film) throws SQLException{
        try{
            String sql = "DELETE FROM "+tableBDD+" WHERE id="+film.getId()+";";
            Console.print(sql);
            statement.executeUpdate(sql);
            Console.print("->Suppression de la ligne "+film.getId()+" dans la table ["+tableBDD+"] OK");
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
