
import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        System.out.println(s);
        String res = "";
        int key = sc.nextInt();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res += " ";
            } else {
                int as = (int) s.charAt(i) + key;
                if (as > 90) {
                    int p = as % 90 + 64;
                    res += (char) p;
                } else {
                    res += (char) as;
                }
            }
        }
        System.out.println(res);
    }

}
