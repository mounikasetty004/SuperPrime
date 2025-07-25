
import java.util.Scanner;

public class StackConceptUsingArray {

    static int top;
    int size;
    static int[] stack;
    static int evenCount = 0;
    static int oddCount = 0;

    public StackConceptUsingArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push " + data);
            return;
        }
        stack[++top] = data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to pop");
            return;
        }
        int t = stack[top];
        stack[top--] = 0;
        count(t);
    }

    public void count(int t) {
        if (t % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty,nothing to display");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of elements to push in stack");
        int n = sc.nextInt();
        StackConceptUsingArray obj = new StackConceptUsingArray(n);
        for (int i = 0; i < n; i++) {
            obj.push(i);
        }
        obj.display();
        for (int i = 0; i < n; i++) {
            obj.pop();
        }
        System.out.println("Even count : " + evenCount);
        System.out.println("Odd count : " + oddCount);
    }
}
