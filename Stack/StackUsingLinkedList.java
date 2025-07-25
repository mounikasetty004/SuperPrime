
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class StackUsingLinkedList {

    Node top;
    static int evenCount = 0;
    static int oddCount = 0;

    StackUsingLinkedList() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Nothing to display");
        } else {
            Node temp = top;
            while (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("nothing to pop");
        } else {
            int t = top.data;
            count(t);
            top = top.next;
        }
    }

    public void count(int t) {
        if (t % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of elements to push in stack");
        int n = sc.nextInt();
        StackUsingLinkedList obj = new StackUsingLinkedList();
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
