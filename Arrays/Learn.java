package Arrays;

import java.util.Arrays;

class DynamicArray {
    private int size = 0;
    private int capacity = 0;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        Arrays.fill(this.arr, -1);
    }

    public int get(int index) {
        return this.arr[index];
    }

    public void set(int index, int item) {
        arr[index] = item;
        this.size++;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void printArr() {
        for (int item : this.arr) {
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }

    public void resize() {
        int[] newArr = new int[this.capacity * 2];
        Arrays.fill(newArr, -1);
        System.arraycopy(this.arr, 0, newArr, 0, this.capacity);
        this.arr = newArr;
    }
}

public class Learn {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray(3);
        da.set(1, 3);
        da.printArr();
        da.resize();
        da.printArr();
    }
}
