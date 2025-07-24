
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public long fact(long n) {
        long f;
        if (n == 0 || n == 1) {
            f = 1;
        } else {
            f = n * fact(n - 1);
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();
        try {
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                long n = sc.nextLong();
                if (n < 0) {
                    System.out.println("factorial for Negative numbers does not exists");
                } else {
                    System.out.println("Factorial of " + n + " is : " + obj.fact(n));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Sorry!we are doing factorial so please provide Integer data");
        }
    }
}
