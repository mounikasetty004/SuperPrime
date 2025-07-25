import java.util.Scanner;

class ArrayQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return; // Stop enqueue if full
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw exception
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("nothing to display");
        } else {
            // Because queue is circular, print carefully
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
}

public class STACKUsingTwoQueues {

    int capacity;
    ArrayQueue q1;
    ArrayQueue q2;

    // Remove static top - it isn't necessary for this implementation
    // We can use q1.isEmpty() to check if stack is empty

    STACKUsingTwoQueues(int c) {
        this.capacity = c;
        q1 = new ArrayQueue(capacity);
        q2 = new ArrayQueue(capacity);
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void push(int data) {
        // Enqueue in q2 first
        q2.enqueue(data);

        // Enqueue all elements of q1 into q2
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }

        // Swap q1 and q2
        ArrayQueue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        q1.dequeue();
    }

    public void display() {
        if (q1.isEmpty()) {
            System.out.println("nothing to display");
        } else {
            q1.display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity:");
        int c = sc.nextInt();

        STACKUsingTwoQueues stack = new STACKUsingTwoQueues(c);

        for (int i = 0; i < c; i++) {
            System.out.println("Enter element to push:");
            int n = sc.nextInt();
            stack.push(n);
        }

        System.out.print("Stack elements: ");
        stack.display();

        stack.pop();
        stack.pop();

        System.out.print("Stack after popping two elements: ");
        stack.display();

        sc.close();
    }
}
