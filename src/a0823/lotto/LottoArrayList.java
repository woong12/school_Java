package a0823.lotto;

import java.util.ArrayList;
import java.util.Collections;

public class LottoArrayList {
    void getRandomBall() {
        ArrayList<Integer> lotto = new ArrayList<>();

        int count = 0;
        while(lotto.size()<6) {
            int num = (int)(Math.random() * 45 )+ 1;
            if (lotto.contains(num)) {
                continue;
            }
            lotto.add(num);
            count ++;
        }
        Collections.sort(lotto);
        for (Integer n : lotto) {
            System.out.println(n);
        }
    }
}
