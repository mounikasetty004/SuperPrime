
import java.util.Arrays;
import java.util.Scanner;

public class ArraysConcept{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=12;
        int[] marksArray=new int[n];
        for(int i=0;i<n;i++){
            marksArray[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(marksArray));
    }
}