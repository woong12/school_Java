package a0920.Swing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class Dictionary extends JFrame implements ActionListener {

    private JLabel label1 = new JLabel("Eng");
    private JLabel label2 = new JLabel("Kor");
    private JTextField eng = new JTextField(10);
    private JTextField kor = new JTextField(10);
    private JButton btnSave = new JButton("Save");
    private JButton btnSearch = new JButton("Search");
    private JTextArea txtArea = new JTextArea(7, 25);
    private JScrollPane sp = new JScrollPane(txtArea);

    // hashmap
    private HashMap<String, String> dic = new HashMap<>();


    public static void main(String[] args) {
        new Dictionary();
    }

    Dictionary() {
        setBounds(1300, 0, 330, 250);
        setTitle("Dictionary");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        panel.add(label1);
        panel.add(eng);
        panel.add(label2);
        panel.add(kor);
        panel.add(btnSave);
        panel.add(btnSearch);
        panel.add(sp);
        setVisible(true);

        // event
        btnSave.addActionListener(this);
        btnSearch.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSave) {
            save();
        } else if(e.getSource() == btnSearch) {
            search();
        }
    }   

    private void save() {
        // eng, kor에 저장된 값을 읽어온다.
        String engString = eng.getText().trim();
        String korString = kor.getText().trim();
        if(engString.length() == 0 || korString.length() == 0) {
            txtArea.append("입력한 단어를 확인하세요");
            return;
        } 

        // 해쉬맵에 데이터 저장
        if(dic.containsKey(korString)) {
            dic.put(engString, korString);
            txtArea.append("수정: " + engString + ":" + korString + "\n");
        } else {
            dic.put(engString, korString);
            txtArea.append("저장: " + engString + ":" + korString + "\n");
        }
    }

    private void search() {
        String engString = eng.getText().trim();
        if(engString.length() == 0) {
            txtArea.append("찾고싶은 영단어를 입력하세요 \n");
            return;
        } else {
            String value = dic.get(engString);
            if(value == null) {
                txtArea.append("사전에 없는 단어입니다. \n");
            } else {
                txtArea.append(engString + "의 한국말은 " + value + "\n");
            }
        }
    }
}