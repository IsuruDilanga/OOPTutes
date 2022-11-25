package JTableQuestion;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {

    private String[] columnName = {"Name", "Date of birth", "Type"};
    private ArrayList<Person> list;

    public PersonTableModel(ArrayList<Person> personArrayList) {
        this.list = personArrayList;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        if (columnIndex == 0){
            temp = list.get(rowIndex).getName();
        } else  if (columnIndex == 1){
            temp = list.get(rowIndex).getDob().getDate();
        } else if (columnIndex == 2){
            if (list.get(rowIndex) instanceof Teacher)
                temp = "Teacher";
            else
                temp = "Student";
        }
        return temp;
    }

    public String getColumnName(int col){
        return columnName[col];
    }

}
