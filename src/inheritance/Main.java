package inheritance;

import javax.swing.text.AsyncBoxView;
import java.util.Map;

class Parent {
//    Parent() {
//        System.out.println("Parent constructor");
//    }
    void search() {
        System.out.println("Searching Parent...");
    }

    public static int paste() {
        System.out.println("Pasting.....");
        return 0;
    }
    int a = 10;
}

class child extends  Parent{
    child() {
//        int a1 = super.a;
        System.out.println(super.a);
        System.out.println("Child constrictor");
        super.search();
    }

//    @Override
//    void search() {
//        System.out.println("Over ride search method");
//    }
}


public abstract class Main {

    static public void main(String[] args) {
        child child = new child();
    }

    abstract String Hello();
}