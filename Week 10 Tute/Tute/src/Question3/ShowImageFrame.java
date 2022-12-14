package Question3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowImageFrame extends JFrame {

    JButton btnOne;
    JButton btnTwo;
    JLabel lblImage;

    ImageIcon imageIconZero;
    ImageIcon imageIconOne;
    ImageIcon imageIconTwo;

    public ShowImageFrame(){

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.setBackground(Color.blue);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        btnOne = new JButton("One");
        p1.add(btnOne);

        btnTwo = new JButton("Two");
        p1.add(btnTwo);
        try{
            imageIconOne = new ImageIcon(getClass().getResource("/zero.png"));
        }catch (NullPointerException e){
            System.out.println("Image one not found");
        }
//        imageIconZero = new ImageIcon(getClass().getResource("/zero.png"));
        lblImage = new JLabel(imageIconZero, JLabel.CENTER);
        cp.add(lblImage, BorderLayout.CENTER);
        cp.add(p1, BorderLayout.SOUTH);

        imageIconOne = new ImageIcon(getClass().getResource("one.png"));
        imageIconTwo = new ImageIcon(getClass().getResource("two.png"));

        MyListener myListener = new MyListener();
        btnOne.addActionListener(myListener);
        btnTwo.addActionListener(myListener);

        lblImage.addMouseListener(myListener);
    }

    private class MyListener extends MouseAdapter implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();
// event.getActionCommand() returns the button's label
            if (btnLabel.equals("One")) {
                lblImage.setIcon(imageIconOne);
            } else if (btnLabel.equals("Two")) {
                lblImage.setIcon(imageIconTwo);
            }
        }
        public void mouseClicked(MouseEvent evt){
            lblImage.setIcon(imageIconZero);
        }
    }

    public static void main(String[] args) {
// Invoke the constructor by allocating an anonymous instance
        ShowImageFrame myFrame = new ShowImageFrame();
        myFrame.setSize(600, 400); // "super" Frame sets initial size
        myFrame.setTitle("My Frame"); // "super" Frame sets title
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true); // show "super" Frame
    }
}