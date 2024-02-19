package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class UseStack {

    private static Stack<Integer> stack;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> intList = Arrays.asList(11, 12, 13, 14, 15);

//        push
        stack.push(1);
        stack.push(2);

//        add list items into stack
        boolean isAdded = stack.addAll(intList);

        System.out.println(intList + " were added to the stack");

//        pop
        Integer element = stack.pop();
        System.out.println("retrieved element: " + element);

//        is empty
        System.out.println("is stack empty: " + stack.isEmpty());

//        size
        System.out.println("size of stack: " + stack.size());

//        peek
        System.out.println("top element: " + stack.peek());

//        search - returns position of element from top
        System.out.println("position of element from top: " + stack.search(11));

//        index of
        System.out.println("index of element : " + stack.indexOf(11));

//        remove
        stack.removeElement(13);

//        print stack
        System.out.println(stack);
    }
}
