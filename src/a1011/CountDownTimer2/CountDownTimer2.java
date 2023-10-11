package a1011.CountDownTimer2;

import javax.swing.JLabel;

public class CountDownTimer2 implements Runnable {

    JLabel timerLabel;
    CountDownTimer2(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        while ( true ) {
            String str = timerLabel.getText();
            int n = Integer.parseInt(str) - 1;
            if (n == -1)
                break;
            str = Integer.toString(n);
            timerLabel.setText(str);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
