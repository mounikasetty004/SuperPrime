
import java.util.Scanner;

public class Fibonacci {

    public int fib(int n) {
        int f;
        if (n > 2) {
            f = fib(n - 1) + fib(n - 2);
        } else if (n == 2) {
            f = 1; 
        }else {
            f = 0;
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();
        int n = sc.nextInt();
        System.out.println(obj.fib(n));
    }
}
