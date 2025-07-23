
class Linked {

    int data;
    Linked next;

    public Linked(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedListConcept {

    public static void main(String[] args) {
        Linked a = new Linked(10);
        Linked b = new Linked(20);
        Linked c = new Linked(30);
        Linked d = new Linked(40);
        a.next = b;
        b.next = c;
        c.next = d;
        Linked temp = a;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

}
