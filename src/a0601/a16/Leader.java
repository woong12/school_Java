package a0601.a16;
public class Leader extends Students{
    // 맴버 변수
    boolean lead;

    // 생성자
    public Leader() {}
    public Leader(String name, String hakbun, boolean lead) {
        this.name = name;
        this.hakbun = hakbun;
        this.lead = lead;
    }

    // 메소드
    public void isLeader() {
        if (lead == true) {
            System.out.println(name + "은 학급회장이다.");
        } else {
            System.out.println(name + "은 학급회장이 아니다.");
        }
    }
}
