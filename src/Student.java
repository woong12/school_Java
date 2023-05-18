class Student {
    // String name;
    // int grade;
    // static int count = 0;
    // public Student() {
    //     count++;
    // }

    // public static int getCount() {
    //     return count;
    // }

    // private String name;
    // private int grade;
    // public Student(){}
    // public Student(String n) {
    //     name = n;
    // }

    // public void print() {
    //     System.out.println("학생의 이름은 " + name + "입니다.");
    // }

    // private String name;
    // private int grade;
    // public Student(){}
    // public Student(String name) {
    //     this.name = name;
    // }

    // public Student(String name, int grade) {
    //     this.name = name;
    //     this.grade = grade;
    // }

    // public void print() {
    //     System.out.println("학생의 이름은 " + name + "이고, " + grade + "입니다.");
    // }

    private String name;
    private int grade;

    public Student(){}
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }

    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setGrade( int grade ) {
        this.grade = grade;
    }
    public int getGrade() {
        return this.grade;
    }
    
}
