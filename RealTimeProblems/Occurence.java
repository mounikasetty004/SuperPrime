
import java.util.Arrays;
import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] marksArray = new int[n];
        for (int i = 0; i < n; i++) {
            marksArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(marksArray));
        int c = 0, ele = 2;
        for (int i = 0; i < n; i++) {
            if (marksArray[i] == ele) {
                c++;
            }
        }
        System.out.println(c);
    }
}
