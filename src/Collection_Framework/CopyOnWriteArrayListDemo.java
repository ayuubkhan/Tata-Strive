package Collection_Framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Ayub","Yusuf","Nazreen","Anwar"));

        for (String s : list) {
            if (s.equals("Nazreen")) {
              list.add("Chudail");
                System.out.println("Added real name of Nazreen: "+s);
            }
        }
        System.out.println(list);
    }
}
