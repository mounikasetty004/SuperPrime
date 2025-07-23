
import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marksArray=new int[n];
        for(int i=0;i<n;i++){
            marksArray[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if(marksArray[i]==ele) {
                System.out.println("found");
                return;}
            else {
                System.out.println("not found");
            return; 
            }
        }
    }
}