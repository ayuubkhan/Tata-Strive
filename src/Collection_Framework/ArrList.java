package Collection_Framework;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(4);
//        list.remove(1);  //removes index 1
//        list.remove(Integer.valueOf(1));  //
        list.sort(null);
        Collections.sort(list);



        System.out.println(list);

    }
}
