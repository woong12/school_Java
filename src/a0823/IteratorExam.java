package a0823;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("--------------------");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       // remove C and print
       list.remove("C");
        System.out.println("--------------------");

        iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
