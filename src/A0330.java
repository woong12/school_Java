// import java.util.Scanner;

public class A0330 {
    public static void main(String[] args) {
        /**
         * 18
        int a = 10;
        if (a % 2 == 0) {
            System.out.println(a + "��(��) ¦���Դϴ�.");
        } else {
            System.out.println(a + "��(��) Ȧ���Դϴ�.");
        }
         */

         /**
         * 19
         int a = 20, b = 10;
         char op = '*';

         if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
         } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
         } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
         } else if (op == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
         } else {
            System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
         }
         */

         /**
          * 20
         int a = 10;
         if (a) {
            System.out.println(a + "�� 0�� �ƴմϴ�.");
         } else {
            System.out.println(a + "�� 0�Դϴ�.");
         }
          */

          /**
           * 21
          int a = 20, b = 10;
          char op = '*';
 
          switch (op) {
            case '+':
                System.out.println( a + " + " + b + " = " + (a + b));

            case '-':
                System.out.println( a + " - " + b + " = " + (a - b));
                
            case '*':
                System.out.println( a + " * " + b + " = " + (a * b));

            case '/':
                System.out.println( a + " / " + b + " = " + (a / b));
          
            default:
            System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
          }
          */


          /**
           * 22
          int a = 7;
          switch(a % 3) {
            case 0:
                System.out.println( a + "��(��) 3�� ����Դϴ�.");
                break;
            case 1:
            case 2:
                System.out.println( a + "��(��) 3�� ����� �ƴմϴ�.");
                break;
          }
           */

           /**
            * 23
           Scanner sc = new Scanner(System.in);
           System.out.println("�� �Է� : ");
           int a = sc.nextInt();
           int day;
           switch(a) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                default:
                    day = 28;
           }
           System.out.println( a + "���� " + day + "���Դϴ�.");
        */

        /**
         * 24
        for (int i = 1; i <= 5; i++) {
            System.out.print(i +"\t");
        }
        System.out.println();
        for (int i = 1; i <= 10; i += 3) {
            System.out.print(i +"\t");
        }
        System.out.println();
        for(int i = 10; i > 5; i--) {
            System.out.print(i +"\t");
        }
         */
    
         /**
          * 25
        int even_sum = 0, odd_sum = 0;
        for (int i = 1; i <= 10; i++) {
            if(i % 2== 0) {
                even_sum += i;
            } else {
                odd_sum += i;
            }
        }
        System.out.println("1���� 10 ������ ¦���� ���� " + even_sum + "�̰�, " + " Ȧ�� ���� " + odd_sum + "�Դϴ�.");
          */

        
    }
}
