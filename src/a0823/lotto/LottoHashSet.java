package a0823.lotto;

import java.util.Collections;
import java.util.HashSet;

public class LottoHashSet {

    public void getRandomBall() {

        HashSet<Integer> lotto = new HashSet<Integer>();

        while (lotto.size()<6){
            int num = (int)(Math.random() * 45 )+ 1;
            lotto.add(num);
        }

        for (Integer n : lotto) {
            System.out.println(n);
        }
    }

}
