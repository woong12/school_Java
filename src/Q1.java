
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("정수5 개를 입력해 주세요.");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int max = 0;
        int i = 0;
        int sum = 1;
        while (i < arr.length) {
            System.out.printf("%d번째 정수 : ", sum);
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }

            sum++;
            i++;
        }
        sc.close();
        System.out.println("입력한 값들 중 최대값은 " + max + "입니다.");
    }
}
