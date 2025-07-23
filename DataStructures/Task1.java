
import java.util.Scanner;


public class Task1 {

    String name;
    int age;

    Task1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        Task1 obj1 = new Task1(name,age);
        obj1.display();
        String name1=sc.next();
        int age1=sc.nextInt();
        Task1 obj2 = new Task1(name1,age1);
        obj2.display();
    }
}
