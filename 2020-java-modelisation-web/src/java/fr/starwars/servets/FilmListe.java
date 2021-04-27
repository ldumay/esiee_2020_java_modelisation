/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.starwars.servets;

import static fr.bases.Console.print;
import fr.bases.classes.DAOFilm;
import fr.bases.classes.Film;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mtl
 */
@WebServlet(name = "FilmListe", urlPatterns = {"/FilmListe"})
public class FilmListe extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            /*
            Film filmH = new Film(0, "Là-Haut","2010", 1, 1234.123, 6443.123);
            daoFilm.addFilm("films", filmH);
             */
            String requetSQL = "SELECT * FROM films";
            DAOFilm daoFilm = new DAOFilm();
            //daoFilm.deleteFilm("films", 67);
            ArrayList daoFilmList = new ArrayList();
            daoFilmList.addAll(daoFilm.listReadingArrayList(requetSQL));

            out.println("<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<title>Servlet FilmListe</title>"
                    + "<link href=\"https://dev.ldumay.fr/resources/bootstrap/4.1.3/css/bootstrap.min.css\" rel=\"stylesheet\">"
                    + "<link href=\"https://dev.ldumay.fr/resources/bootstrap/4.1.3/css/bootstrap-grid.min.css\" rel=\"stylesheet\">"
                    + "</head>"
                    + "<body>"
                    + "<div class=\"container\">"
                    + "<div class=\"row\">"
                    + "<div class=\"col-12\">"
                    + "<h1>Liste des films <small style=\"font-size:16px;\"><a href=\"/2020-java-modelisation-web/\">[accueil]</a></small></h1>"
                    + "<hr>"
                    //-
                    +"<table class=\"table\">"
                    + "<thead>"
                    + "<tr>"
                    + "<th scope=\"col\">Id</th>"
                    + "<th scope=\"col\">Titre</th>"
                    + "<th scope=\"col\">Année</th>"
                    + "<th scope=\"col\">Numéro de l'épisode</th>"
                    + "<th scope=\"col\">Coût</th>"
                    + "<th scope=\"col\">Recette</th>"
                    + "<th scope=\"col\">Bénéfice</th>"
                    + "</tr>"
                    + "</thead>"
                    + "<tbody>");
            
            for (Iterator it = daoFilmList.iterator(); it.hasNext();) {
                Film film = (Film) it.next();
                out.println(""
                        + "<tr>"
                        + "<th scope=\"row\">"+film.getId()+"</th>"
                        + "<td>"+film.getTitre()+"</td>"
                        + "<td>"+film.getAnneeDeSortie()+"</td>"
                        + "<td>"+film.getNumeroEpisode()+"</td>"
                        + "<td>"+film.getCout()+"</td>"
                        + "<td>"+film.getRecette()+"</td>"
                        + "<td>"+film.calculBenefice()+"</td>"
                        + "</tr>");
            }
            
            out.println(""
                    + "</tbody>"
                    + "</table>"
                    //-
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</body>"
                    + "</html>"
                    + "");

            daoFilm.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FilmListe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FilmListe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
