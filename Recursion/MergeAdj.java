
import java.util.Scanner;

public class MergeAdj {

    public static String mergeChar(String s) {
        String res = "";
        String ch1 = s.substring(0, 1);
        if (!res.contains(ch1)) {
            res += ch1;
        }
        res += mergeChar(ch1);
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(mergeChar(s));
    }
}
