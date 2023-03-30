
import java.util.Scanner;

public class A0309 {

	public static void main(String[] args) throws Exception {
		String major, num, name;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("학과 : ");
		major = sc.next();
		System.out.println("학번 : ");
		num = sc.next();
		System.out.println("이름 : ");
		name = sc.next();
				
		System.out.println("저는 " + major + num + name + "입니다.");
		
		//----------------------------------------------------------------------
		//예제 4
		int num1, num2, num3;
		int sum;
		double avg;
				

		System.out.println("첫번째 수 입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		num2 = sc.nextInt();
		System.out.println("세번째 수 입력 : ");
		num3 = sc.nextInt();
				
		sum = num1 + num2 + num3;
		avg = sum / 3.0;
				
		System.out.printf("합계 : %d 평균 : %.1f", sum, avg);
		sc.close();
	}
}