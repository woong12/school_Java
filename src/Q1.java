import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("정수5 개를 입력해 주세요.");
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int max = 0;
        int i = 0;
        while (i < num.length) {
            System.out.printf((i + 1) + "번째 정수 : ");
            num[i] = sc.nextInt();

            if (num[i] > max) {
                max = num[i];
            }

            i++;
        }
        sc.close();
        System.out.println("입력한 값들 중 최대값은 " + max + "입니다.");
    }
}
