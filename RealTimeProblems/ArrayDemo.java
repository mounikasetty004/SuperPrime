
class Std {

    String name;

    public Std(String name) {
        this.name = name;
    }
}

public class ArrayDemo {

    public static void main(String[] args) throws Exception {
        Std myArray[] = new Std[3];
        myArray[0] = new Std("java");
        myArray[0] = new Std("object");
        myArray[0] = new Std("Array");
        for (Std str : myArray) {
            System.out.println(str.name);
        }
    }
}
