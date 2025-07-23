
import java.util.Scanner;

public class VowelConsonentsCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=str.toLowerCase();
        int vc=0,cc=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                vc++;
            }
            else
                cc++;
        }
        System.out.println("vowel count:"+vc);
        System.out.println("consonant count:"+cc);
    }
}