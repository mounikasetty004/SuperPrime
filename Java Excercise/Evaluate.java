
public class Evaluate {

    public static void main(String[] args) {
        int x = 5 + 3 * 2;
        int y = (5 + 3) * 2;
        System.out.println(x);
        System.out.println(y);
        System.out.println("increement");
        int a = 10;
        System.out.println(a++);
        System.out.println(++a);
        int b = 4, c = 9, d = 7;
        int res = b++ + b-- + (b * b) / b % b;
        System.out.println(res);
        System.out.println(10 + 20 + "java" + 10 + 20);
        System.out.println(a + b * c / d);

    }
}
