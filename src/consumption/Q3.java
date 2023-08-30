package consumption;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달 입력: ");
        int month = sc.nextInt();
        int day = 0;

        switch (month) {
            case 2:
                day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                day = 31;
                break;
        }

        sc.close();
        System.out.println(month + "월은 " + day + "일입니다.");
    }
}