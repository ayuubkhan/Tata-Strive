package Collection_Framework;

import java.util.LinkedList;

class Node {
    public int value;
    public Node next;
}
public class LinkList {
    public static void main(String[] args) {
        /*// Traditional way to LinkedList
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 2;
        node1.next = node2;
        node2.value = 3;
        node2.next = null;

        Node temp = node1;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }*/

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);

//        linkedList.removeIf(a -> a % 2 == 0);

        System.out.println(linkedList);


    }
}
