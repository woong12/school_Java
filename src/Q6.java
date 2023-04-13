public class Q6 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        if(++num1 < 5 | ++num2 > 8) {
            System.out.println(num1);
        }
        System.out.println(num2);

        System.out.println("----------------------------");
        int num3 = 3;
        int num4 = 7;

        if(++num1 < 5 || ++num2 > 8) {
            System.out.println(num3);
        }
        System.out.println(num4);
    }
}
