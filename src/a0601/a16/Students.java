package a0601.a16;
public class Students{
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;

    public Students() { }
    public Students(String name, String hakbun) 
    {
        this.name = name;
        this.hakbun = hakbun;
    }

    public void study() {
        System.out.println("공부하다.");
    }
    public void eat() {
        System.out.println("식사하다.");
    }

    public void teast() {
        System.out.println("시험보다.");
    }
    public void extra_act() {
        System.out.println("동아리 활동하다.");
    }
}
