
import java.util.Scanner;

public class ArrayTree {

    int[] arr;
    int size = 0, left = 0, right = 0, root = 0, capacity;

    ArrayTree(int c) {
        this.capacity = c;
        arr = new int[capacity];
    }

    public void add(int data) {
        if (isEmpty()) {
            arr[size] = data;
            size++;
        } else {
            if (data < arr[root]) {
                arr[size] = data;

                size++;
            } else if (data > arr[root]) {
                arr[size] = data;
                root = arr[size];
                size++;
            }
        }
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    // public boolean isFull(){
    //     return arr.length==size-1;
    // }
    public void display() {
        if (isEmpty()) {
            System.out.println("sorry! no elements in tree");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        ArrayTree obj = new ArrayTree(c);
        obj.add(10);
        obj.add(18);
        obj.add(3);
        obj.add(2);
        obj.add(1);
        obj.display();

    }
}
