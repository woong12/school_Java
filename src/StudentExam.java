public class StudentExam {
    public static void main(String[] args) {
        // Student kim = new Student();
        // Student jang = new Student();
        // Student bak = new Student();

        // System.out.println("생성된 학생 객체 수는 " +  Student.count + "입니다.");
        
        // Student kim = new Student();
        // Student jang = new Student( "장민재" );
        // Student lee = new Student( "김로봇", 1);

        // kim.print();
        // jang.print();
        // lee.print();

        Student kim = new Student("김현우");
        kim.setGrade(2);
        Student jang = new Student( "장민재", 3 );
        System.out.println("학생의 이름은 " + kim.getName() + "이고, " + kim.getGrade() + "학년입니다.");
        System.out.println("학생의 이름은 " + jang.getName() + "이고, " + jang.getGrade() + "학년입니다.");

        
    }   
}
