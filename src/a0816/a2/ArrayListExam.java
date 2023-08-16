package a0816.a2;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();
        
        System.out.println(list + "크기:" + list.size());
        list.add(0, null);
        
    }
}
