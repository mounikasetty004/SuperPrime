
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}
