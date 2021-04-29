/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.main;

import fr.ldumay.others.Console;
import java.awt.BorderLayout;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import starwars.classes.Acces;
import starwars.dao.DAOLogin;

/**
 *
 * @author ldumay
 */
public class ViewLogin extends JFrame implements ActionListener{
    
    JPanel contentPanel;
    //-
    String messageString;
    JLabel messageLabel;
    String loginString;
    JLabel loginLabel;
    //-
    JPanel contentLeftPanel;
    String passwordString;
    JLabel passwordLabel;
    //-
    JPanel contentRightPanel;
    String loginRightString;
    JTextField loginRightTextField;
    //-
    String passwordRightString;
    JPasswordField passwordRightTextField;
    //-
    String connexionString;
    JButton connexionButton;
    //-
    Acces user;
    //-
    ViewUsersList usersList;
    
    /**
     * Constructor
     */
    public ViewLogin(){
        super("Star Wars");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 300));
        this.setLocationRelativeTo(null);
        
        contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        contentPanel.add(createLeftPanel());
        contentPanel.add(createRightPanel());
        
        messageString = "Erreur de login / Mot de Passe";
        messageString.toUpperCase();
        messageLabel = new JLabel(messageString);
        messageLabel.setVisible(false);
        contentPanel.add(messageLabel);
    }
    
    /**
     * Création d'un panneau qui serait placé à gauche.
     * 
     * @return JPanel
     */
    private JPanel createLeftPanel(){
        contentLeftPanel = new JPanel(new BorderLayout());
        
        loginString = "Identifiant";
        loginString.toUpperCase();
        loginLabel = new JLabel(loginString);
        loginLabel.setPreferredSize(new Dimension(150, 40));
        contentLeftPanel.add(loginLabel, BorderLayout.NORTH);
        
        passwordString = "Mot de passe";
        passwordString.toUpperCase();
        passwordLabel = new JLabel(passwordString);
        passwordLabel.setPreferredSize(new Dimension(150, 40));
        contentLeftPanel.add(passwordLabel, BorderLayout.SOUTH);
        
        return contentLeftPanel;
    }
    
    /**
     * Création d'un panneau qui serait placé à droite.
     * 
     * @return JPanel
     */
    private JPanel createRightPanel(){
        contentRightPanel = new JPanel(new BorderLayout());
        
        loginRightString = "Identifiant";
        loginRightString.toUpperCase();
        loginRightTextField = new JTextField(loginRightString);
        loginRightTextField.setPreferredSize(new Dimension(250, 30));
        contentRightPanel.add(loginRightTextField, BorderLayout.NORTH);
        
        passwordRightString = "Mot de passe";
        passwordRightString.toUpperCase();
        passwordRightTextField = new JPasswordField(passwordRightString);
        passwordRightTextField.setPreferredSize(new Dimension(250, 30));
        contentRightPanel.add(passwordRightTextField, BorderLayout.WEST);
        
        connexionString = "Se connecter";
        connexionString.toUpperCase();
        connexionButton = new JButton(connexionString);
        connexionButton.addActionListener(this);
        connexionButton.setPreferredSize(new Dimension(150, 40));
        contentRightPanel.add(connexionButton, BorderLayout.SOUTH);
        
        return contentRightPanel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if( (JButton)event.getSource() == connexionButton){
            Console.print("[Demande de connexion]");
            DAOLogin daoLogin = new DAOLogin();
            String login = loginRightTextField.getText();
            String password = passwordRightTextField.getText();
            Console.print("Login : "+login+" - Password : "+password);
            try {
                user = daoLogin.checkPAssword(login, password);
                if(user!=null){
                    Console.print("user : "+user.getLogin()+" / "+user.getPassword());
                    usersList = new ViewUsersList();
                    messageLabel.setText("Connecté");
                    messageLabel.setVisible(true);
                } else {
                    messageLabel.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
