
import java.util.Scanner;

public class QueueUsinglinkedList {

    Node top;
    static int evenCount = 0;
    static int oddCount = 0;

    QueueUsinglinkedList() {
        top = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            top = newnode;
        } else {
            Node temp = top;
            while (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            temp.next = newnode;
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
            obj.enqueue(i);
        }
        obj.display();
        for (int i = 0; i < n; i++) {
            obj.dequeue();
        }
        System.out.println("Even count : " + evenCount);
        System.out.println("Odd count : " + oddCount);
    }
}


class StackUsingTwoQueues {
    private ArrayQueue q1;
    private ArrayQueue q2;

    public StackUsingTwoQueues(int capacity) {
        q1 = new ArrayQueue(capacity);
        q2 = new ArrayQueue(capacity);
    }

    public void push(int x) {
        // Enqueue the new element into q2
        q2.enqueue(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }

        // Swap q1 and q2
        ArrayQueue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.dequeue();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}