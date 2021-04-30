/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.abstracts;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import starwars.classes.Acces;

/**
 *
 * @author ldumay
 */

/**
 * Class Absract - TableModelAcces
 * <br>
 * <br>Constructor :
 * <br>- TableModelAcces(ArrayList<Acces> daoUsersList)
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
 * <br>
 * <br>End.
 */
public class TableModelAcces extends AbstractTableModel {

    private ArrayList<Acces> usersList;
    private String[] columns;

    /**
     * Constructor
     * 
     * TableModelAcces(ArrayList<Acces> daoUsersList)
     * 
     * @param daoUsersList
     */
    public TableModelAcces(ArrayList<Acces> daoUsersList) {
        super();
        usersList = daoUsersList;
        columns = new String[]{"ID", "Prénom", "Login", "Password", "Statut", "Age"};
    }

    // Number of column of your table
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    // The object to render in a cell
    @Override
    public Object getValueAt(int row, int col) {
        Acces user = usersList.get(row);
        switch (col) {
            case 0:
                return user.getId();
            case 1:
                return user.getPrenom();
            case 2:
                return user.getLogin();
            case 3:
                return user.getPassword();
            case 4:
                return user.getStatut();
            case 5:
                return user.getAge();
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
        return usersList.size();
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
