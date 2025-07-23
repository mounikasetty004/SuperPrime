
import java.util.Scanner;

public class CapitalCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 0;
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            c++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1) >= 'A' && str.charAt(i + 1) <= 'Z') {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
