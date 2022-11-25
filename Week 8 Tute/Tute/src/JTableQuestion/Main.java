package JTableQuestion;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        Person t1 = new Teacher("Teacher1", new Date(1997,01,23), 1500.50);
        Person t2 = new Teacher("Teacher2", new Date(2000,10,25), 2050.20);
        Person s1 = new Student("Student1", new Date(2005,15,21), "11111");
        Person s2 = new Student("Student2", new Date(2007,10,10), "22222");

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(t1);
        personArrayList.add(t2);
        personArrayList.add(s1);
        personArrayList.add(s2);

        PersonTableModel tableModel = new PersonTableModel(personArrayList);
        JTable myTable = new JTable(tableModel);

        JScrollPane pane = new JScrollPane(myTable);
        pane.setBounds(0,50,500,300);

        frame.add(pane);

        myTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            Color originalColor = null;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
                Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (value == "Teacher"){
                    renderer.setBackground(Color.GREEN);
                } else {
                    renderer.setBackground(Color.BLUE);
                }
                return renderer;
            }

        });

        frame.setVisible(true);
    }
}
