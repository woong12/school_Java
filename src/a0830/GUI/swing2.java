package a0830.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class swing2 extends JFrame {
    public static void main(String[] args) {
        new swing2();
    }

    public swing2() {
        setBounds(1200, 300, 500, 500);
        setTitle("test");

        JPanel p = new JPanel();
        p.setBackground(Color.yellow);
        // p.setLayout(null);
        p.setLayout(new GridLayout(2,3));
        add(p);

        JButton btn1 = new JButton("확인");
        JButton btn2 = new JButton("확인");
        JButton btn3 = new JButton("확인");
        JButton btn4 = new JButton("확인");
        JButton btn5 = new JButton("확인");

        btn1.setSize(100, 100);
        btn2.setSize(100, 100);
        btn3.setSize(100, 100);
        btn4.setSize(100, 100);
        btn5.setSize(100, 100);

        btn1.setSize(0, 0);
        btn2.setSize(100, 0);
        btn3.setSize(200, 0);
        btn4.setSize(300, 0);
        btn5.setSize(400, 0);

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);

        // JButton btn2 = new JButton("2");
        // btn2.setLocation(100, 0);
        // p.add(btn2);
        


        setVisible(true);
        
    }
}
