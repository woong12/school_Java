package consumption;


import java.util.Scanner;

public class A0309 {

	public static void main(String[] args) throws Exception {
		String major, num, name;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("�а� : ");
		major = sc.next();
		System.out.println("�й� : ");
		num = sc.next();
		System.out.println("�̸� : ");
		name = sc.next();
				
		System.out.println("���� " + major + num + name + "�Դϴ�.");
		
		//----------------------------------------------------------------------
		//���� 4
		int num1, num2, num3;
		int sum;
		double avg;
				

		System.out.println("ù��° �� �Է� : ");
		num1 = sc.nextInt();
		System.out.println("�ι�° �� �Է� : ");
		num2 = sc.nextInt();
		System.out.println("����° �� �Է� : ");
		num3 = sc.nextInt();
				
		sum = num1 + num2 + num3;
		avg = sum / 3.0;
				
		System.out.printf("�հ� : %d ��� : %.1f", sum, avg);
		sc.close();
	}
}