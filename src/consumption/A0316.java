package consumption;



public class A0316 {
    public static void main(String[] args) {
        String str1 = "abc";
		String str2 = new String("abc");
		
		if (str1 == str2) {
			System.out.println("same");
		} else {
			System.out.println("Diffrent");
		}
    }
}