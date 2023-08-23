package a0823.hashMap;

import java.util.HashMap;

public class HashMapExam {
    public static void main(String[] args) {
        //key, value : name, score
        HashMap<String, Integer> map = new HashMap<>();

        map.put("cat", 100);
        map.put("dog", 10);
        map.put("hamster", 78);
        map.put("rabbit",43);
        
        System.out.println("총 학생수:" + map.size());
        System.out.println(map.get("cat"));

        // remove
        map.remove("cat");

        if(map.containsKey("cat")) {
            System.out.println(map.get("cat"));
        } else {
            System.out.println("존재하지 않음");
        }
        // print keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // print values
        for (Integer val : map.values()) {
            System.out.println(val);
        }

        // print set
        for(String key : map.keySet()) {
            map.put(key, 0);
            System.out.println(key + " " + map.get(key));
        }

        // remove all
        map.clear();



    }

}
