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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import starwars.classes.Acces;
import starwars.classes.Avis;
import starwars.classes.Film;
import starwars.dao.DAOAvis;
import starwars.dao.DAOFilm;
import starwars.dao.DAOAvisForFilmByAcces;

/**
 *
 * @author ldumay
 */

/**
 * Class - ViewAvisAjout
 * <br>
 * <br>Constructor :
 * <br>- ViewAvisAjout()
 * <br>
 * <br>End.
 */
public class ViewAvisAjout extends JFrame implements ActionListener{
    
    private Film film = new Film();
    private Avis avis = new Avis();
    private Acces acces = new Acces();
    //-
    private final JLabel filmSelectionneLabel;
    private JComboBox<Film> filmSelectionneComboBox;
    private ArrayList<Film> filmsArrayList;
    //-
    private final JLabel titreAvisLabel;
    private final JTextField titreAvisTextField;
    //-
    private final JLabel descriptionAvisLabel;
    private final JTextField descriptionAvisTextField;
    //-
    private final JLabel noteAvisLabel;
    private final JTextField noteAvisTextField;
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
    public ViewAvisAjout(Acces acces) throws SQLException{
        super("Star Wars - Ajout d'un nouvel avis");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(460, 380));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        Dimension dimensionForm = new Dimension(450, 25);
        
        filmSelectionneLabel = new JLabel("Chxoi du film");
        filmSelectionneLabel.setPreferredSize(dimensionForm);
        contentPanel.add(filmSelectionneLabel);
        generationDuComboBoxFilms();
        filmSelectionneComboBox.setPreferredSize(dimensionForm);
        contentPanel.add(filmSelectionneComboBox);
        
        titreAvisLabel = new JLabel("Titre du nouvel avis [string]");
        titreAvisLabel.setPreferredSize(dimensionForm);
        contentPanel.add(titreAvisLabel);
        titreAvisTextField = new JTextField();
        titreAvisTextField.setPreferredSize(dimensionForm);
        contentPanel.add(titreAvisTextField);
        
        descriptionAvisLabel = new JLabel("Description du nouvel avis [string]");
        descriptionAvisLabel.setPreferredSize(dimensionForm);
        contentPanel.add(descriptionAvisLabel);
        descriptionAvisTextField = new JTextField();
        descriptionAvisTextField.setPreferredSize(dimensionForm);
        contentPanel.add(descriptionAvisTextField);
        
        noteAvisLabel = new JLabel("Note du nouvel avis [int 0-5]");
        noteAvisLabel.setPreferredSize(dimensionForm);
        contentPanel.add(noteAvisLabel);
        noteAvisTextField = new JTextField();
        noteAvisTextField.setPreferredSize(dimensionForm);
        contentPanel.add(noteAvisTextField);
        
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
    
    private void generationDuComboBoxFilms() throws SQLException{
        filmSelectionneComboBox = new JComboBox();
        //-
        DAOFilm daoFilm = new DAOFilm();
        filmsArrayList = daoFilm.listReadingArrayList();
        daoFilm.close();
        //-
        for(Film film : filmsArrayList){
            filmSelectionneComboBox.addItem(film);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if((JButton)event.getSource() == validerViewButton){
            Console.print("[Ajout d'un utilisateur]");
            DAOAvis daoAvis = new DAOAvis();
            try {
                if( film!=null && avis!=null && acces!=null
                    && !titreAvisTextField.getText().isEmpty() && !descriptionAvisTextField.getText().isEmpty()
                    && !noteAvisTextField.getText().isEmpty() ){
                    String titreAvis = titreAvisTextField.getText();
                    String descriptionAvis = descriptionAvisTextField.getText();
                    int noteAvis = Integer.parseInt(noteAvisTextField.getText());
                    //-
                    Avis newAvis = new Avis(titreAvis, descriptionAvis, noteAvis);
                    daoAvis.addAvis(newAvis);
                    daoAvis.close();
                    //-
                    avis = newAvis;
                    film = (Film) filmSelectionneComboBox.getSelectedItem();
                    DAOAvisForFilmByAcces daoAvisForFilmByAcces= new DAOAvisForFilmByAcces();
                    daoAvisForFilmByAcces.addAvisForFilmByAcces(avis, film, acces);
                    daoAvisForFilmByAcces.close();
                    //-
                    Console.print("[Ajout réussi]");
                    //-
                    String message = "Ajout réussi";
                    Console.print("["+message+"]");
                    resultatAjout(true, message);
                }
            } catch (SQLException ex) {
                String message = "Erreur ajout";
                Console.print("["+message+"]");
                resultatAjout(true, message);
                Logger.getLogger(ViewAvisAjout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //_
        if((JButton)event.getSource() == annulerViewButton){
            Console.print("[Fermeture fenêtre]");
            this.dispose();
        }        
    }
    
    private void nettoyageFormulaire(){
        titreAvisTextField.setText("");
        descriptionAvisTextField.setText("");
        noteAvisTextField.setText("");
    }
    
    private void resultatAjout(boolean valid, String message){
        nettoyageFormulaire();
        //-
        if(valid==true){
            filmSelectionneLabel.setVisible(false);
            filmSelectionneComboBox.setVisible(false);
            titreAvisLabel.setVisible(false);
            titreAvisTextField.setVisible(false);
            descriptionAvisLabel.setVisible(false);
            descriptionAvisTextField.setVisible(false);
            noteAvisLabel.setVisible(false);
            noteAvisTextField.setVisible(false);
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
