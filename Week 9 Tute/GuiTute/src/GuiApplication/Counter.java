package GuiApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private JLabel lblCount;
    private JTextField tfCount;
    private JButton btnCountUp;
    private JButton btnCountDown;
    private JButton btnReset;
    private int count = 0;

    public Counter(){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        lblCount = new JLabel("Counter");
        add(lblCount);

        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCountUp = new JButton("Count up");
        add(btnCountUp);

        btnCountDown = new JButton("Count down");
        add(btnCountDown);

        btnReset = new JButton("Reset");
        add(btnReset);

        MyListener handler = new MyListener();
        btnCountUp.addActionListener(handler);
        btnCountDown.addActionListener(handler);
        btnReset.addActionListener(handler);
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();
            if (btnLabel.equals("Count up")){
                ++count;
                System.out.println(count);
                tfCount.setText(count + "");
            } else if (btnLabel.equals("Count down")){
                --count;
                tfCount.setText(count + "");
            } else if (btnLabel.equals("Reset")){
                count = 0;
                tfCount.setText(count + "");
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counter.setSize(200,200);
        counter.setVisible(true);
    }

}


