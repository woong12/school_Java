package a0615;

public class BookMain {
    public static void main(String[] args) {
        System.out.println(Book.getLibrary() + "의 현재 도서는 " + Book.getBookCnt() + "권 입니다.");
        
        System.out.println("*************************************************");
        Book b1 = new Book();
        b1.setNo(100);
        b1.setName("구름빵");
        b1.setCount(10);
        Book b2 = new Book(101, "수박수영장");
        b2.setCount(5);
        Book b3 = new Book(102, "강아지똥", 15);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        System.out.println("*************************************************");
        System.out.println(Book.getLibrary() + "의 현재 도서는 " + Book.getBookCnt() + "권 입니다.");

        System.out.println("*************************************************");

        b1.borrrowBook(15);
        b2.returnBook(2);
        b1.borrrowBook(5);
        b3.borrrowBook(10);
        b3.returnBook(5);

        System.out.println("*************************************************");

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
