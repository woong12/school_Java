package a0615.a2;

public class Student extends Person {
    boolean online;

    @Override
    public void printInfo() {
        super.printInfo();
        if(online == true) {
            System.out.println(name+"은 학생이며 현재 온라인 수업 중입니다.");
        } else {
            System.out.println(name+"은 학생이며 현재 등교 수업 중입니다.");
        }
    }
}
