package a0615.a2;

public class SoccerPlayer extends Person {
    String teamName;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name + "는" + teamName + "팀 축구선수입니다.");
    }
}
