package a0830.GUI;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloSwing extends JFrame {
    public static void main(String[] args) {
        new HelloSwing();
    }

    HelloSwing() {
        setSize(400, 400);
        setLocation(1070, 250);
        setTitle("Hello");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        
        JPanel panel = new JPanel();
        panel.setSize(200, 200);
        panel.setBackground(Color.red);
        add(panel);

        JPanel panel2 = new JPanel();
        panel2.setSize(100, 100);
        panel2.setLocation(0, 200);
        panel2.setBackground(Color.yellow);
        add(panel2);
        
        
        setVisible(true);
    }
        
}
