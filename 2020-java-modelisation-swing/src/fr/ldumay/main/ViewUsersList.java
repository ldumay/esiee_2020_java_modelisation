/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.main;

import core.abstracts.TableModelFilms;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import starwars.classes.Film;
import starwars.dao.DAOFilm;

/**
 *
 * @author ldumay
 */
public class ViewUsersList extends JFrame implements ActionListener{
    
    private String deconnexionString;
    private JButton deconnexionButton;
    //-
    private ArrayList<Film> daoFilmList;
    
    /**
     * Constructor
     */
    public ViewUsersList() throws SQLException{
        super("Star Wars");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 300));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        DAOFilm daoFilm = new DAOFilm();
        this.daoFilmList = daoFilm.listReadingArrayList();
        daoFilm.close();
        
        TableModel filmsTableModel = new TableModelFilms(this.daoFilmList);
        JTable usersListTable = new JTable(filmsTableModel);
        usersListTable.setPreferredScrollableViewportSize(new Dimension(480, 260));
        usersListTable.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(usersListTable);
        contentPanel.add(scrollPane);
        
        deconnexionString = "Déconnexion";
        deconnexionButton.setText(deconnexionString);
        contentPanel.add(deconnexionButton);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if((JButton)event.getSource() == deconnexionButton){
            //-->close
        }
    }
    
}
