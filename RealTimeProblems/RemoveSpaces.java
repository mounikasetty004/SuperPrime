
import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (String i : arr) {
            System.out.print(i);
        }
    }
}
