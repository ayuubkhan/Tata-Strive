package Collection_Framework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.add('a');
        stack.push('b');
        stack.add('c');
        stack.push('d');
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
