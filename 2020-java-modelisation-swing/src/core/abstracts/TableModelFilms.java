/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.abstracts;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import starwars.classes.Film;

/**
 *
 * @author ldumay
 */
public class TableModelFilms implements TableModel {

    private ArrayList<Film> filmsArrayList;
    private String[] columns;

    /**
     * Constructor
     * 
     * @param daoFilmList
     */
    public TableModelFilms(ArrayList<Film> daoFilmList) {
        super();
        filmsArrayList = daoFilmList;
        columns = new String[]{"ID", "Titre", "Année", "Nb épisode", "Coût", "Recette"};
    }

    // Number of column of your table
    public int getColumnCount() {
        return columns.length;
    }

    // Number of row of your table
    public int getRowsCount() {
        return filmsArrayList.size();
    }

    // The object to render in a cell
    public Object getValueAt(int row, int col) {
        Film film = filmsArrayList.get(row);
        switch (col) {
            case 0:
                return film.getId();
            // to complete here...
            default:
                return null;
        }
    }

    // Optional, the name of your column
    public String getColumnName(int col) {
        return columns[col];
    }
    
    
    //-Code généré et néssessaire.

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
