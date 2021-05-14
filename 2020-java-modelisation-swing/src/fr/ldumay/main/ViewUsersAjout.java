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
import starwars.classes.Acces;
import starwars.dao.DAOUser;

/**
 *
 * @author ldumay
 */

/**
 * Class - ViewUsersAjout
 * <br>
 * <br>Constructor :
 * <br>- ViewUsersAjout()
 * <br>
 * <br>End.
 */
public class ViewUsersAjout extends JFrame implements ActionListener{
    
    private final JLabel prenomAccesLabel;
    private final JTextField prenomAccesTextField;
    //-
    private final JLabel loginAccesLabel;
    private final JTextField loginAccesTextField;
    //-
    private final JLabel passwordAccesLabel;
    private final JTextField passwordAccesTextField;
    //-
    private final JLabel statutAccesLabel;
    private final JTextField statutAccesTextField;
    //-
    private final JLabel ageAccesLabel;
    private final JTextField ageAccesTextField;
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
    public ViewUsersAjout() throws SQLException{
        super("Star Wars - Ajout d'un nouvel utilisateur");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(400, 380));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        Dimension dimensionForm = new Dimension(380, 25);
        
        prenomAccesLabel = new JLabel("Prénom du nouvel utilisateur [string]");
        prenomAccesLabel.setPreferredSize(dimensionForm);
        contentPanel.add(prenomAccesLabel);
        prenomAccesTextField = new JTextField();
        prenomAccesTextField.setPreferredSize(dimensionForm);
        contentPanel.add(prenomAccesTextField);
        
        loginAccesLabel = new JLabel("Login du nouvel utilisateur [string]");
        loginAccesLabel.setPreferredSize(dimensionForm);
        contentPanel.add(loginAccesLabel);
        loginAccesTextField = new JTextField();
        loginAccesTextField.setPreferredSize(dimensionForm);
        contentPanel.add(loginAccesTextField);
        
        passwordAccesLabel = new JLabel("Password du nouvel utilisateur [string]");
        passwordAccesLabel.setPreferredSize(dimensionForm);
        contentPanel.add(passwordAccesLabel);
        passwordAccesTextField = new JTextField();
        passwordAccesTextField.setPreferredSize(dimensionForm);
        contentPanel.add(passwordAccesTextField);
        
        statutAccesLabel = new JLabel("Statut du nouvel utilisateur [string]");
        statutAccesLabel.setPreferredSize(dimensionForm);
        contentPanel.add(statutAccesLabel);
        statutAccesTextField = new JTextField();
        statutAccesTextField.setPreferredSize(dimensionForm);
        contentPanel.add(statutAccesTextField);
        
        ageAccesLabel = new JLabel("Age du nouvel utilisateur [int]");
        ageAccesLabel.setPreferredSize(dimensionForm);
        contentPanel.add(ageAccesLabel);
        ageAccesTextField = new JTextField();
        ageAccesTextField.setPreferredSize(dimensionForm);
        contentPanel.add(ageAccesTextField);
        
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
            Console.print("[Ajout d'un utilisateur]");
            DAOUser daoUser = new DAOUser();
            try {
                if( !prenomAccesTextField.getText().isEmpty() && !loginAccesTextField.getText().isEmpty()
                    && !passwordAccesTextField.getText().isEmpty() && !statutAccesTextField.getText().isEmpty()
                    && !ageAccesTextField.getText().isEmpty() ){
                    String prenomAcces = prenomAccesTextField.getText();
                    String loginAcces = loginAccesTextField.getText();
                    String passwordAcces = passwordAccesTextField.getText();
                    String statutAcces = statutAccesTextField.getText();
                    int ageAcces = Integer.parseInt(ageAccesTextField.getText());
                    //-
                    Acces newAcces = new Acces(prenomAcces, loginAcces, passwordAcces, statutAcces, ageAcces);
                    daoUser.addAcces(newAcces);
                    daoUser.close();
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
                Logger.getLogger(ViewUsersAjout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //_
        if((JButton)event.getSource() == annulerViewButton){
            Console.print("[Fermeture fenêtre]");
            this.dispose();
        }        
    }
    
    private void nettoyageFormulaire(){
        prenomAccesTextField.setText("");
        loginAccesTextField.setText("");
        passwordAccesTextField.setText("");
        statutAccesTextField.setText("");
        ageAccesTextField.setText("");
    }
    
    private void resultatAjout(boolean valid, String message){
        nettoyageFormulaire();
        //-
        if(valid==true){
            prenomAccesLabel.setVisible(false);
            prenomAccesTextField.setVisible(false);
            loginAccesLabel.setVisible(false);
            loginAccesTextField.setVisible(false);
            passwordAccesLabel.setVisible(false);
            passwordAccesTextField.setVisible(false);
            statutAccesLabel.setVisible(false);
            statutAccesTextField.setVisible(false);
            ageAccesLabel.setVisible(false);
            ageAccesTextField.setVisible(false);
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
