package consumption;

public class Q2 {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 4 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for(int k = 1; k <= 4; k++) {
            for(int l = 1; l <= 3; l++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();

        for (int m = 1; m <= 4; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
        System.out.println();

        for (int o = 3; o >= 0; o--) {
            for (int p = 1; p <= o; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int o = 3; o >= 0; o--) {
            for (int p = 1; p <= o; p++) {
                System.out.print(p);
            }
            System.out.println();
        }

        for (int o = 1; o <= 3; o++) {
            for (int p = 3; p >= o; p--) {
                System.out.print(o);
            }
            System.out.println();
        }
    }
}