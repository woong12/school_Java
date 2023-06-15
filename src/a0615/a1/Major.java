package a0615.a1;

public class Major extends Book {
    String subject;
    
    @Override
    public void printBook() {
        super.printBook();
        System.out.println("전공 분야는 " + subject + "입니다");
    }
}
