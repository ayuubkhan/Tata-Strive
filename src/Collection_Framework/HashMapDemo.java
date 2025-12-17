package Collection_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ayub");
        map.put(2,"Shubham");
        map.put(3,"Ashfaque");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(98));

        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(27));

        System.out.println(map.containsValue("shubham"));

//        Set<Integer> integers = map.keySet();
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

//        Internal Structure of HashMap

    }
}
