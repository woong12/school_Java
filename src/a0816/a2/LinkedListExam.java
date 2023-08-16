package a0816.a2;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(78);
        list.add(99);
        list.add(55);
        myPrint(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst(100);
        list.addLast(100);
        Collections.sort(list);
        myPrint(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    static  void myPrint(LinkedList list) {
        System.out.println(" 크기ㅣ" + list.size() + list.toString());
    }
}
