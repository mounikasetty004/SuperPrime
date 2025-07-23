
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12, max = 0, min = 0;
        int[] marksArray = new int[n];
        for (int i = 0; i < n; i++) {
            marksArray[i] = sc.nextInt();
        }
        for (int i : marksArray) {
            if (i > max) {
                max = i;
            }
            if (i < max && i > min) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
