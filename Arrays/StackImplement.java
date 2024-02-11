package Arrays;

class Stack {
    private final int size;
    private final int[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        arr = new int[size];
    }

    public void push(int item) {
        if (this.isFull()) {
            System.out.println("stack is full!");
            return;
        }

        arr[++top] = item;
    }

    public void pop() {
        if (this.isEmpty()) {
            System.out.println("stack is empty!");
            return;
        }

        this.top = this.top - 1;
    }

    private boolean isFull() {
        return this.top >= this.size - 1;
    }

    private boolean isEmpty() {
        return this.top == -1;
    }

    public void printStack() {
        for (int i = 0; i <= this.top; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
    }

    public void peek() {
        if (this.isEmpty()) {
            System.out.println("stack is empty");
            return;
        }

        System.out.println(arr[top]);
    }

}

public class StackImplement {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStack();

        stack.peek();
        stack.pop();
        stack.peek();
    }
}