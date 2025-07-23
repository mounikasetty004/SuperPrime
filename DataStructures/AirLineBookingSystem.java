
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AirLineBookingSystem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> namesList = new ArrayList<String>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            namesList.add(name);
        }
         ArrayList<Integer> seatNo = new  ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int No=sc.nextInt();
            seatNo.add(No);
        }
         ArrayList<String> cityList = new  ArrayList<String>();
        for(int i=0;i<n;i++){
            String =sc.next();
            cityList.add(city);
        }
        for(int i=0;i<n;i++){
            System.out.println("Name: "+namesList[i]+"Seat no: "+seatNo[i]+"Destination: "+cityList[i]);
        }
    }
}