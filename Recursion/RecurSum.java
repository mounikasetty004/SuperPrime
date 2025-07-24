
import java.util.Scanner;

public class RecurSum{
    public int sum(int n){
        if(n>0){
            int rem=n%10;
            n=n/10;
            return rem+sum(n);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        RecurSum obj=new RecurSum();
        System.out.println(obj.sum(n));
    }
}