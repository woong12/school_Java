package consumption;



public class A0406 {
    public static void main(String[] args) {

        
                /** ���� 31
        * 
            int i = 1;
            while (i <= 5) {
                System.out.print(i + "\t");
                i++;
        }
         */

                /** ���� 32
         * 
        int i = 1, sum = 0;
        System.out.print("1-2+3-4+5-6+7-8+9-10=");
        while (i <= 10) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
         */
        
                /** ���� 33
         * 
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i > 10);
         */

                /** ���� 34
        * 
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i +"\t");
        }
        */

                /** ���� 35
        * 
        for (int i = 1; i <= 10; i++) {
            System.out.print(i +"\t");
            if (i == 5) {
                break;
            }
        }
        */

                /** ���� 36
        * 
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i +"\t");
        }
        */

        
    }
}
