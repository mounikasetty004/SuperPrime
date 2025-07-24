// input:bpisbcpijk
// output: b3.14sbc3.14jk

import java.util.Scanner;

public class Task1 {

    public static String replacePi(String s) {
        if (s.length() < 2) {
            return s;
        }
        String res = "";
        String sub = s.substring(0, 2);
        String sub2 = s.substring(2);

        if (sub.equalsIgnoreCase("pi")) {
            res += "3.14";
            res += replacePi(sub2);
        } else {
            res += s.charAt(0);
            res += replacePi(s.substring(1));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals(" ")) {
            System.out.println("null string input is not replaced");
        } else {
            System.out.println(replacePi(s));
        }

    }
}
