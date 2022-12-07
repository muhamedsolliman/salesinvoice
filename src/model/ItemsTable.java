
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ItemsTable extends AbstractTableModel {

    private ArrayList<Items> items;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public ItemsTable(ArrayList<Items> items) {
        this.items = items;
    }

    public ArrayList<Items> getLines() {
        return items;
    }
    
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Items line = items.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getNum();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}
