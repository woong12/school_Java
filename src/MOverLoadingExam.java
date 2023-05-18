public class MOverLoadingExam {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.sum("서울", "로봇"));
        System.out.println(a.sum(10, 20));
    }
}
