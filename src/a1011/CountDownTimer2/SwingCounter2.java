package a1011.CountDownTimer2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SwingCounter2 extends JFrame implements ActionListener{
    
    JPanel p = new JPanel();
    JLabel labelNumber = new JLabel("10");

    JButton btnInc = new JButton("증가");
    JButton btnDec = new JButton("감소");
    JButton btnCls = new JButton("초기화");
    JButton btnStart = new JButton("카운드다운");


    public static void main(String[] args) {
        new SwingCounter2();
    }

    public SwingCounter2() {
        labelNumber.setFont(new Font("Gothic", Font.BOLD, 80));
        
        setBackground(Color.cyan);
        setTitle(("counter2"));
        setLocationRelativeTo(null);
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p.setBackground(Color.cyan);
        add(p);
        p.add(btnInc);
        p.add(btnDec);
        p.add(btnCls);
        p.add(btnStart);
        p.add(labelNumber);

        setVisible(true);

        btnInc.addActionListener(this);
        btnDec.addActionListener(this);
        btnCls.addActionListener(this);
        btnStart.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnInc) {
            String str = labelNumber.getText();
            int count = Integer.parseInt(str) + 1;
            str = Integer.toString(count);
            labelNumber.setText(str);
        } else if(e.getSource() == btnDec) {
            String str = labelNumber.getText();
            int count = Integer.parseInt(str) - 1;
            if (count != -1) {
                str = Integer.toString(count);
                labelNumber.setText(str);
            }
        } else if(e.getSource() == btnCls) {
            labelNumber.setText("0");
            btnStart.setEnabled(true);
        } else if(e.getSource() == btnStart) {
            CountDownTimer2 runnable = new CountDownTimer2(labelNumber);
            Thread thread = new Thread(runnable);
            thread.start();
            
            btnStart.setEnabled(false);

        }
    }
}
