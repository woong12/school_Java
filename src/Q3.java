import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달 입력: ");
        int month = sc.nextInt();
        int days = 0;

        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }

        sc.close();
        System.out.println(month + "월은 " + days + "일입니다.");
    }
}