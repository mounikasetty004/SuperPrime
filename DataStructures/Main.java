
public class Main {

    public static void main(String[] args) {
        Student obj = new Student("Alice", 20);
        obj.display();
    }
}

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
