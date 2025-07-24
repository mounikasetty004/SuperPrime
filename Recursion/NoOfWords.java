
import java.util.Scanner;

public class NoOfWords {

    public static String digitWord(int n) {
        if (n == 0) {
            return "Zero";
        }
        if (n == 1) {
            return "One";
        }
        if (n == 2) {
            return "Two";
        }
        if (n == 3) {
            return "Three";
        }
        if (n == 4) {
            return "Four";
        }
        if (n == 5) {
            return "Five";
        }
        if (n == 6) {
            return "Six";
        }
        if (n == 7) {
            return "Seven";
        }
        if (n == 8) {
            return "Eight";
        }
        if (n == 9) {
            return "Nine";
        }
        return null;
    }

    public static void inWords(int n) {
        if (n < 10) {
            System.out.print(digitWord(n) + " ");
        } else {
            int rem = n % 10;
            n /= 10;
            inWords(n);
            System.out.print(digitWord(rem) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inWords(n);
    }
}
