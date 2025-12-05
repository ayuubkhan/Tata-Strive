package Collection_Framework;

import java.util.*;
class customCompare implements  Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
public class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(8);
        list.add(4);
//        list.remove(1);  //removes index 1
//        list.remove(Integer.valueOf(1));  //
        list.sort(new customCompare());
//        Collections.sort(list);
        System.out.println(list);

//        Comparator



    }
}
