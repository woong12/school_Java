package a1011;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{

    // 변수 선언
    JPanel p = new JPanel();
    JLabel labelNumber = new JLabel("10");

    JButton btnInc = new JButton("increase");
    JButton btnDec = new JButton("decrease");
    JButton btnCls = new JButton("clear");
    JButton btnStart = new JButton("countdown");

    
    
    public static void main(String[] args) {
        new SwingCounter(); // call constructor
    }

    public SwingCounter() {
        labelNumber.setFont(new Font("Gothic", Font.BOLD, 80));

        // frame setting
        setBackground(Color.cyan);  // 배경색
        setTitle("counter exam");   // 타이틀
        setLocationRelativeTo(null);    // 화면 중앙
        setSize(350, 200);  // 사이즈
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // 종료버튼

        // panel
        p.setBackground(Color.cyan); 
        add(p);
        p.add(btnInc);
        p.add(btnDec);
        p.add(btnCls);
        p.add(btnStart);
        p.add(labelNumber);
        
        setVisible(true);   // 화면에 나오기

        // event
        btnInc.addActionListener(this);
        btnDec.addActionListener(this);
        btnCls.addActionListener(this);
        btnStart.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnInc) { // increase
            String str = labelNumber.getText(); // 읽어온다
            int count = Integer.parseInt(str) + 1; // 숫자로 바꾸고 + 1
            str = Integer.toString(count); // 다시 문자로 바꾸고
            labelNumber.setText(str); // 라벨에 설정

        } else if(e.getSource() == btnDec) { // decrease
            String str = labelNumber.getText(); // 읽어온다
            int count = Integer.parseInt(str) - 1; // 숫자로 바꾸고 - 1

            // if(str.equals("0") == false) {
            //     str = Integer.toString(count); // 다시 문자로 바꾸고
            //     labelNumber.setText(str); // 라벨에 설정
            // };

            if (count!= -1) {
                str = Integer.toString(count); // 다시 문자로 바꾸고
                labelNumber.setText(str); // 라벨에 설정
            }
                
        } else if(e.getSource() == btnCls) { // clear
            labelNumber.setText("0");
            btnStart.setEnabled(true);


        } else if(e.getSource() == btnStart) { // countdown
            CountDownTimer runnable = new CountDownTimer(labelNumber);
            Thread thread = new Thread(runnable);
            thread.start();

            btnStart.setEnabled(false);
        }
    }
}
