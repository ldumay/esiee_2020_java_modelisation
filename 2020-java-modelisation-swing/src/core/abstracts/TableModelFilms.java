/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.abstracts;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import starwars.classes.Film;

/**
 *
 * @author ldumay
 */

/**
 * Class Absract - TableModelFilms
 * <br>
 * <br>Constructor :
 * <br>- TableModelFilms(ArrayList<Film> daoFilmList)
 * <br>
 * <br>Functions :
 * <br> - getColumnCount()
 * <br> |--> int
 * <br>
 * <br> - getValueAt(int row, int col)
 * <br> |--> Object
 * <br>
 * <br> - getColumnName(int col)
 * <br> |--> int
 * <br>
 * <br> - getRowCount()
 * <br> |--> int
 * <br>
 * <br>End.
 */
public class TableModelFilms extends AbstractTableModel {

    private ArrayList<Film> filmsArrayList;
    private String[] columns;

    /**
     * Constructor
     * 
     * TableModelFilms(ArrayList<Film> daoFilmList)
     * 
     * @param daoFilmList
     */
    public TableModelFilms(ArrayList<Film> daoFilmList) {
        super();
        filmsArrayList = daoFilmList;
        columns = new String[]{"ID", "Titre", "Année", "Nb épisode", "Coût", "Recette", "Bénéfice", "Avis"};
    }

    // Number of column of your table
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    // The object to render in a cell
    @Override
    public Object getValueAt(int row, int col) {
        Film film = filmsArrayList.get(row);
        switch (col) {
            case 0:
                return film.getId();
            case 1:
                return film.getTitre();
            case 2:
                return film.getAnneeDeSortie();
            case 3:
                return film.getNumeroEpisode();
            case 4:
                return film.getCout();
            case 5:
                return film.getRecette();
            case 6:
                double benefice = (double) film.calculBenefice().get(1);
                return benefice;
            case 7:
                int moyenne = 0;
                try{
                    moyenne = (int) film.calculMoyenneAvis();
                }catch(Exception e){ System.err.println(e); }
                return moyenne+"/5";
            default:
                return null;
        }
    }

    // Optional, the name of your column
    @Override
    public String getColumnName(int col) {
        return columns[col];
    }
    
    // Number of row of your table
    @Override
    public int getRowCount() {
        return filmsArrayList.size();
    }

    //-Code généré et néssessaire.
    /*
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    */

}
