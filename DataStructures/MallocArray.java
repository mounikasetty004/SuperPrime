
import java.util.Scanner;

public class MallocArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inhabitants count: ");
        int c = sc.nextInt();
        int[] arr = new int[c];

        System.out.print("Enter the inhabitants name: ");
        String[] arr1 = new String[c];
        for (int i = 0; i < c; i++) {
            arr1[i] = sc.nextLine();
        }
        System.out.print("Enter the inhabitants ages: ");
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The ages of the inhabitants are: ");
        for (int i = 0; i < c; i++) {
            System.out.println(arr1[i] + ": " + arr[i]);
        }

    }
}
