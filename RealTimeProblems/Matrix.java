
import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int[][] arr1=new int[n][n];
        for (int i =0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i =0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}