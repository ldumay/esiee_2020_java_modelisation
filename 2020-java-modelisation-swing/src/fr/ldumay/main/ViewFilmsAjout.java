/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.main;

import fr.ldumay.others.Console;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import starwars.classes.Film;
import starwars.dao.DAOFilm;

/**
 *
 * @author ldumay
 */

/**
 * Class - ViewFilmsAjout
 * <br>
 * <br>Constructor :
 * <br>- ViewFilmsAjout()
 * <br>
 * <br>End.
 */
public class ViewFilmsAjout extends JFrame implements ActionListener{
    
    private final JLabel titreDuFilmLabel;
    private final JTextField titreDuFilmTextField;
    //-
    private final JLabel anneeDuFilmLabel;
    private final JTextField anneeDuFilmTextField;
    //-
    private final JLabel numeroEpisodeFilmLabel;
    private final JTextField numeroEpisodeFilmTextField;
    //-
    private final JLabel coutEpisodeFilmLabel;
    private final JTextField coutEpisodeFilmTextField;
    //-
    private final JLabel recetteEpisodeFilmLabel;
    private final JTextField recetteEpisodeFilmTextField;
    //-
    private final String validerViewString;
    private final JButton validerViewButton;
    //-
    private final String annulerViewString;
    private final JButton annulerViewButton;
    //-
    private final JLabel messageLabel;
    
    /**
     * Constructor
     * 
     * @throws java.sql.SQLException
     */
    public ViewFilmsAjout() throws SQLException{
        super("Star Wars - Ajout d'un film");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(400, 380));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        Dimension dimensionForm = new Dimension(380, 25);
        
        titreDuFilmLabel = new JLabel("Titre du film [string]");
        titreDuFilmLabel.setPreferredSize(dimensionForm);
        contentPanel.add(titreDuFilmLabel);
        titreDuFilmTextField = new JTextField();
        titreDuFilmTextField.setPreferredSize(dimensionForm);
        contentPanel.add(titreDuFilmTextField);
        
        anneeDuFilmLabel = new JLabel("Année du film [string]");
        anneeDuFilmLabel.setPreferredSize(dimensionForm);
        contentPanel.add(anneeDuFilmLabel);
        anneeDuFilmTextField = new JTextField();
        anneeDuFilmTextField.setPreferredSize(dimensionForm);
        contentPanel.add(anneeDuFilmTextField);
        
        numeroEpisodeFilmLabel = new JLabel("Numéro de l'épisode du film [int]");
        numeroEpisodeFilmLabel.setPreferredSize(dimensionForm);
        contentPanel.add(numeroEpisodeFilmLabel);
        numeroEpisodeFilmTextField = new JTextField();
        numeroEpisodeFilmTextField.setPreferredSize(dimensionForm);
        contentPanel.add(numeroEpisodeFilmTextField);
        
        coutEpisodeFilmLabel = new JLabel("Coût du film [double]");
        coutEpisodeFilmLabel.setPreferredSize(dimensionForm);
        contentPanel.add(coutEpisodeFilmLabel);
        coutEpisodeFilmTextField = new JTextField();
        coutEpisodeFilmTextField.setPreferredSize(dimensionForm);
        contentPanel.add(coutEpisodeFilmTextField);
        
        recetteEpisodeFilmLabel = new JLabel("Recette du film [double]");
        recetteEpisodeFilmLabel.setPreferredSize(dimensionForm);
        contentPanel.add(recetteEpisodeFilmLabel);
        recetteEpisodeFilmTextField = new JTextField();
        recetteEpisodeFilmTextField.setPreferredSize(dimensionForm);
        contentPanel.add(recetteEpisodeFilmTextField);
        
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setPreferredSize(dimensionForm);
        messageLabel.setVisible(false);
        contentPanel.add(messageLabel);
        
        validerViewString = "Valider";
        validerViewButton = new JButton(validerViewString);
        validerViewButton.addActionListener(this);
        contentPanel.add(validerViewButton);
        
        annulerViewString = "Fermer";
        annulerViewButton = new JButton(annulerViewString);
        annulerViewButton.addActionListener(this);
        contentPanel.add(annulerViewButton);
        
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if((JButton)event.getSource() == validerViewButton){
            Console.print("[Ajout d'un film]");
            DAOFilm daoFilm = new DAOFilm();
            try {
                if( !titreDuFilmTextField.getText().isEmpty() && !anneeDuFilmTextField.getText().isEmpty()
                    && !numeroEpisodeFilmTextField.getText().isEmpty() && !coutEpisodeFilmTextField.getText().isEmpty()
                    && !recetteEpisodeFilmTextField.getText().isEmpty() ){
                    String titreDuFilm = titreDuFilmTextField.getText();
                    String anneeDuFilm = anneeDuFilmTextField.getText();
                    int numeroEpisodeDuFilm = Integer.parseInt(numeroEpisodeFilmTextField.getText());
                    double coutDuFilm = Double.parseDouble(coutEpisodeFilmTextField.getText());
                    double recetteDuFilm = Double.parseDouble(recetteEpisodeFilmTextField.getText());
                    //-
                    Film newFilm = new Film(titreDuFilm, anneeDuFilm, numeroEpisodeDuFilm, coutDuFilm, recetteDuFilm);
                    daoFilm.addFilm("films", newFilm);
                    daoFilm.close();
                    //-
                    String message = "Ajout réussi";
                    Console.print("["+message+"]");
                    resultatAjout(true, message);
                }
            } catch (SQLException ex) {
                String message = "Erreur ajout";
                Console.print("["+message+"]");
                resultatAjout(true, message);
                Logger.getLogger(ViewFilmsAjout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //_
        if((JButton)event.getSource() == annulerViewButton){
            Console.print("[Fermeture fenêtre]");
            this.dispose();
        }        
    }
    
    
    
    private void nettoyageFormulaire(){
        titreDuFilmTextField.setText("");
        anneeDuFilmTextField.setText("");
        numeroEpisodeFilmTextField.setText("");
        coutEpisodeFilmTextField.setText("");
        recetteEpisodeFilmTextField.setText("");
    }
    
    private void resultatAjout(boolean valid, String message){
        nettoyageFormulaire();
        //-
        if(valid==true){
            titreDuFilmLabel.setVisible(false);
            titreDuFilmTextField.setVisible(false);
            anneeDuFilmLabel.setVisible(false);
            anneeDuFilmTextField.setVisible(false);
            numeroEpisodeFilmLabel.setVisible(false);
            numeroEpisodeFilmTextField.setVisible(false);
            coutEpisodeFilmLabel.setVisible(false);
            coutEpisodeFilmTextField.setVisible(false);
            recetteEpisodeFilmLabel.setVisible(false);
            recetteEpisodeFilmTextField.setVisible(false);
            validerViewButton.setVisible(false);
            //-
            messageLabel.setText(message+".\nVous pouvez fermer la page.");
            this.setSize(new Dimension(400, 100));
        }
        else{
            messageLabel.setText(message+".\nVeuillez réessayer.");
        }
        messageLabel.setVisible(true);
    }
    
}
