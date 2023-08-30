package consumption;



public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("이도령");
        e1.setNo(100);
        e1.setAge(25);
        System.out.println("[직원 정보] " + e1.toString());


        Employee e2 = new Employee("성춘향", 200, 18); //e2 객체 생성
System.out.println("[직원 정보] " + e2.toString());

e1.setNo(300); //e1 no 300으로 변경
System.out.println(e1.getName() + "님의 사번이 " + e1.getNo() + "으로 변경됨.");
System.out.println("[직원 정보] " + e1.toString());

e2.setAge(20); //e2 age 20으로 변경
System.out.println(e2.getName() + "님의 나이가 " + e2.getAge() + "으로 변경됨.");
System.out.println("[직원 정보] " + e2.toString());
}

    
}
