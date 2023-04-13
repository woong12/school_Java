import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                result -= i;
                System.out.print("-" + i);
            } else {
                result += i;
                System.out.print("+" + i);
            }
        }
        System.out.println("=" + result);


        System.out.print("숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        int result2 = 0;
        int j = 1;
        while (j <= num2) {
            if (j % 2 == 0) {
                result2 -= j;
                System.out.print("-" + j);
            } else {
                result2 += j;
                System.out.print("+" + j);
            }
            j++;
        }
        System.out.println("=" + result2);

        sc.close();
    }
}