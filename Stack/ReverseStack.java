
import java.util.Scanner;

public class ReverseStack {

    static int top;
    int size;
    char[] stack;
    static String reverse = "";

    public ReverseStack(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    public void push(char ch) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push " + ch);
            return;
        }
        stack[++top] = ch;
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
        char t = stack[top];
        stack[top--] = 0;
        merge(t);
    }

    public void merge(char t) {
        reverse += t;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty,nothing to display");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String to push in stack");
        String s = sc.nextLine();
        ReverseStack obj = new ReverseStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            obj.push(s.charAt(i));
        }
        obj.display();
        for (int i = 0; i < s.length(); i++) {
            obj.pop();
        }
        System.out.println(reverse);

    }
}
