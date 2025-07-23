
import java.util.Scanner;

public class DevilsGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // int l = 0;
        // for (int k = 0; k < str.length(); k++) {
        //     if (str.charAt(k) == '@' || str.charAt(k) == '$') {
        //         l++;
        //     }
        // }
        // String[] arr = new String[l];
        // String res = "";
        // for (int i = 0; i < str.length(); i++) {
        //     res += str.charAt(i);
        //     if (str.charAt(i) != '@' && str.charAt(i) != '$') {
        //         res += str.charAt(i);
        //     }
        //     res += str.charAt(i);
        //     if (i < l) {

        //         arr[i] = res;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        String[] arr = str.split("[@$]");
        int max = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length() > max) {
                max = arr[j].length();
            }
        }
        System.out.println("the max length of group is:" + (max + 1));
    }
}
