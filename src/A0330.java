import java.util.Scanner;

public class A0330 {
    public static void main(String[] args) {
        /**
         * 18
        int a = 10;
        if (a % 2 == 0) {
            System.out.println(a + "은(는) 짝수입니다.");
        } else {
            System.out.println(a + "은(는) 홀수입니다.");
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
            System.out.println("사칙연산자가 아닙니다.");
         }
         */

         /**
          * 20
         int a = 10;
         if (a) {
            System.out.println(a + "는 0이 아닙니다.");
         } else {
            System.out.println(a + "는 0입니다.");
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
            System.out.println("사칙연산자가 아닙니다.");
          }
          */


          /**
           * 22
          int a = 7;
          switch(a % 3) {
            case 0:
                System.out.println( a + "은(는) 3의 배수입니다.");
                break;
            case 1:
            case 2:
                System.out.println( a + "은(는) 3의 배수가 아닙니다.");
                break;
          }
           */

           /**
            * 23
           Scanner sc = new Scanner(System.in);
           System.out.println("달 입력 : ");
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
           System.out.println( a + "월은 " + day + "일입니다.");
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
        System.out.println("1부터 10 까지의 짝수의 합은 " + even_sum + "이고, " + " 홀수 합은 " + odd_sum + "입니다.");
          */

        
    }
}
