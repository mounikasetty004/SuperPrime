
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String res = new String(sb);
        if (str.equals(res)) {
            System.out.println("Plindrome");
        } else {
            System.out.println(" not a Plindrome");
        }

    }
}
