
import java.util.Scanner;

public class Change {

    public String changextoy(String s) {
        String sub1 = s.substring(0, 1);
        String sub2 = s.substring(1);
        String res = "";
        if (s.length() == 1) {
            return "y";
        }
        if (sub1.equals("x")) {
            res += "y";
            res += changextoy(sub1);
        } else {
            res += s.charAt(0);
            res += changextoy(s.substring(1));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Change obj = new Change();
        String s = sc.next().toLowerCase();
        System.out.println(obj.changextoy(s));
    }
}
