/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author ldumay
 */
public class ViewUsersList extends JFrame{
    
    private String[] tableCoulmnsName = {"Nom", "Valeur", "Utiliser"};
    private Object[][] tableDatas = {
        {"pi", 3.14159, false},
        {"phi", 1.68803, true},
        {"e", 2.71828, false},
        {"euro", 1.0, false},
        {"franc", 6.59, true},
        {"pi", 3.14159, false},
        {"phi", 1.68803, true},
        {"e", 2.71828, false},
        {"euro", 1.0, false},
        {"franc", 6.59, true},
        {"pi", 3.14159, false},
        {"phi", 1.68803, true},
        {"e", 2.71828, false},
        {"euro", 1.0, false},
        {"franc", 6.59, true},
        {"pi", 3.14159, false},
        {"phi", 1.68803, true},
        {"e", 2.71828, false},
        {"euro", 1.0, false},
        {"franc", 6.59, true},
        {"pi", 3.14159, false},
        {"phi", 1.68803, true},
        {"e", 2.71828, false},
        {"euro", 1.0, false},
        {"franc", 6.59, true},
        {"pi", 3.14159, false},
        {"phi", 1.68803, true},
        {"e", 2.71828, false},
        {"euro", 1.0, false},
        {"franc", 6.59, true}
    };
    
    /**
     * Constructor
     */
    public ViewUsersList(){
        super("Star Wars");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 300));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        JTable usersListTable = new JTable(this.tableDatas, this.tableCoulmnsName);
        usersListTable.setPreferredScrollableViewportSize(new Dimension(300, 200));
        usersListTable.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(usersListTable);
        contentPanel.add(scrollPane);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply a look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        
        //Start my Window
        ViewUsersList usersList = new ViewUsersList();
        usersList.setVisible(true);
    }
    
}
