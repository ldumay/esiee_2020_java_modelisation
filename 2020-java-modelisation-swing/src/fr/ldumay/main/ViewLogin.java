/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author ldumay
 */
public class ViewLogin extends JFrame{
    
    /**
     * Constructor
     */
    public ViewLogin(){
        super("Star Wars");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 300));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        contentPanel.add(createLeftPanel());
        contentPanel.add(createRightPanel());
        
        String messageString = "Erreur de login / Mot de Passe";
        JLabel messageLabel = new JLabel(messageString);
        contentPanel.add(messageLabel);
    }
    
    private JPanel createLeftPanel(){
        JPanel contentLeftPanel = new JPanel(new BorderLayout());
        
        String loginString = "Identifiant";
        loginString.toUpperCase();
        JLabel loginLabel = new JLabel(loginString);
        loginLabel.setPreferredSize(new Dimension(150, 40));
        contentLeftPanel.add(loginLabel, BorderLayout.NORTH);
        
        String passwordString = "Mot de passe";
        passwordString.toUpperCase();
        JLabel passwordLabel = new JLabel(passwordString);
        passwordLabel.setPreferredSize(new Dimension(150, 40));
        contentLeftPanel.add(passwordLabel, BorderLayout.SOUTH);
        
        return contentLeftPanel;
    }
    private JPanel createRightPanel(){
        JPanel contentRightPanel = new JPanel(new BorderLayout());
        
        String loginRightString = "Identifiant";
        loginRightString.toUpperCase();
        JTextField loginRightLabel = new JTextField(loginRightString);
        loginRightLabel.setPreferredSize(new Dimension(250, 30));
        contentRightPanel.add(loginRightLabel, BorderLayout.NORTH);
        
        String passwordRightString = "Mot de passe";
        passwordRightString.toUpperCase();
        JTextField passwordRightLabel = new JTextField(passwordRightString);
        passwordRightLabel.setPreferredSize(new Dimension(250, 30));
        contentRightPanel.add(passwordRightLabel, BorderLayout.WEST);
        
        String connexionString = "Se connecter";
        connexionString.toUpperCase();
        JButton connexionLabel = new JButton(connexionString);
        connexionLabel.setPreferredSize(new Dimension(150, 40));
        contentRightPanel.add(connexionLabel, BorderLayout.SOUTH);
        
        return contentRightPanel;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        ViewLogin login = new ViewLogin();
        login.setVisible(true);
    }
    
}
