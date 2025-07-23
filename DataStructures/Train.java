
class Compartment {

    String data;
    Compartment next;

    public Compartment(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Train {

    Compartment rev;
    Compartment head;

    public void insert(String data) {
        Compartment newCom = new Compartment(data);
        if (head == null) {
            head = newCom;
        } else {
            Compartment temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newCom;
        }
    }

    public void insertAtBegin(String data) {

        if (head == null) {
            insert(data);
        } else {
            Compartment newCom = new Compartment(data);
            Compartment temp = head;
            newCom.next = temp;
            head = newCom;
        }
    }

    public void insertAtPosition(String data, String p) {
        if (head == null) {
            System.out.println("Sorry! No compartments to insert at a position");
            return;
        }

        Compartment temp = head;
        while (temp != null && !temp.data.equals(p)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Compartment with data '" + p + "' not found.");
        } else {
            Compartment newCom = new Compartment(data);
            newCom.next = temp.next;
            temp.next = newCom;
        }
    }

    public int count() {
        int c = 1;
        Compartment temp = head;
        while (temp.next != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public void delete() {
        if (head == null) {
            System.out.println("Sorry! there are no compartments to delete");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Compartment temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("Sorry! there are no compartments to delete");
            return;
        }
        head = head.next;

    }

    public void deleteAtPosition(String p) {
        if (head == null) {
            System.out.println("Sorry! there are no compartments to delete");
            return;
        }

        if (head.data.equals(p)) {
            head = head.next;
            return;
        }

        Compartment temp = head;

        while (temp.next != null && !temp.next.data.equals(p)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Compartment with data '" + p + "' not found.");
        } else {

            temp.next = temp.next.next;
        }
    }

    public void search(String ele) {
        if (head == null) {
            System.out.println("No compartments are there to display");
            return;
        }
        Compartment temp = head;
        while (temp != null && !temp.data.equals(ele)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("element not found");
        } else {
            System.out.println(temp.data + "element found");
        }

    }

    public static void middleEle(int c) {
        if (c == 0) {
            System.out.println("list is empty or null.");
            return;
        }
        int mid = c / 2;
       for(int i=0;i<=mid;i++){
           temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void reverse(String data) {
        Compartment newCom = new Compartment(data);
        if (rev == null) {
            rev = newCom;
        } else {
            Compartment temp = rev;
            newCom.next = temp;
            rev = newCom;
        }
    }

    public void displayRev() {

        if (rev == null) {
            System.out.println("No compartments are there to display");
            return;
        }
        Compartment temp = rev;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void display() {
        if (head == null) {
            System.out.println("No compartments are there to display");
            return;
        }
        Compartment temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Train obj = new Train();
        // obj.insert("engine");
        // obj.insert("sleeper");
        // obj.insert("ac");
        // obj.display();

        // obj.insertAtPosition("pantry", "sleeper");
        // obj.display();
        // System.out.println(obj.count());
        // obj.delete();
        // obj.display();
        // System.out.println(obj.count());
        // obj.insertAtBegin("sleeper");
        // obj.display();
        // obj.deleteAtPosition("sleeper");
        // obj.display();
        // System.out.println(obj.count());
        // obj.deleteAtBegin();
        // obj.display();
        // obj.reverse("engine");
        // obj.reverse("sleeper");
        // obj.reverse("pantry");
        // obj.reverse("ac");
        // obj.displayRev();
    }
}
