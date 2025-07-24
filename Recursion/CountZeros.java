
import java.util.Scanner;

public class CountZeros {

    public int count(int n) {
        int c = 0;
        if (n == 0) {
            c = 1;
        } else if (n < 10) {
            c = 0;
        } else if (n % 10 == 0) {
            c = count(n / 10) + 1;
        } else {
            c = count(n / 10);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountZeros obj = new CountZeros();
        int n = sc.nextInt();
        System.out.println(obj.count(n));

    }
}
