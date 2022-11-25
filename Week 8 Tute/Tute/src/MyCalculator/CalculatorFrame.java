package MyCalculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2,5,5));
        p3.setBackground(Color.BLUE);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1,5,5));
        p2.setBackground(Color.BLUE);

        JButton button1 = (JButton) p2.add(new JButton("+"));
        changeDesGREEN(button1);

        JButton button2 = (JButton) p2.add(new JButton("-"));
        changeDesGREEN(button2);

        JButton button3 = (JButton) p2.add(new JButton("Clear"));
        changeDesGREEN(button3);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3,5,5));
        p1.setBackground(Color.BLUE);

        for (int i = 1; i <= 9; i++){
            JButton button = (JButton) p1.add(new JButton("" + i));
            changeDesRED(button);
        }

        JButton button4 = (JButton) p1.add(new JButton("0"));
        changeDesRED(button4);

        JButton button5 = (JButton) p1.add(new JButton("."));
        changeDesRED(button5);

        p3.add(p1);
        p3.add(p2);

        TextField textField = new TextField("45.4");
        textField.setFont(new Font("SansSerif ", Font.BOLD, 16));
        textField.setBackground(Color.YELLOW);
        textField.setForeground(Color.BLUE);

        add(p3, BorderLayout.CENTER);
        add(textField, BorderLayout.NORTH);
    }

    public static void changeDesGREEN(JButton button){
        button.setBackground(Color.GREEN);
        button.setFont(new Font("SansSerif ", Font.BOLD, 16));
        button.setForeground(Color.BLUE);
    }


    public static void changeDesRED(JButton button){
        button.setBackground(Color.RED);
        button.setFont(new Font("SansSerif ", Font.BOLD, 16));
        button.setForeground(Color.BLUE);
    }

    public static void main(String[] args) {
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setTitle("Calculator Frame");
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCalculator.setSize(600, 450);
        myCalculator.setVisible(true);

    }
}
