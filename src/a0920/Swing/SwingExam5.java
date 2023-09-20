
package a0920.Swing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingExam5 extends JFrame implements ActionListener{

    JPanel panel;
    JButton b1, b2, b3, b4;
    JTextField txTextField;
    JLabel label;


    public static void main(String[] args) {
        
        new SwingExam5();
    }

    SwingExam5() {
        setSize(400, 300);
        // setLocation(10, 10);
        // setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.cyan);
        add(panel);

        b1 = new JButton("pink");
        b2 = new JButton("yellow");
        b3 = new JButton("OK");
        b4 = new JButton("초기화");
        txTextField = new JTextField("Hello", 20);
        label = new JLabel(". . .");

        panel.add(b1);
        panel.add(b2);
        panel.add(txTextField);
        panel.add(b3);
        panel.add(b4);
        panel.add(label);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1)  {
            System.out.println("click 1");
            panel.setBackground(Color.pink);
        } else if(e.getSource() == b2) {
            System.out.println("click 2");
            panel.setBackground(Color.yellow);
        }else if(e.getSource() == b3) {
            System.out.println("click 3");
            String string = txTextField.getText() + "님 안녕하세요";    
            label.setText(string);
        } else if (e.getSource() == b4) {
            System.out.println("click 3");
            txTextField.setText("");
        }
    }

    
}
