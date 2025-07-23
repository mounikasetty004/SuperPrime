
public class Operators {

    public static void main(String[] args) {
        // System.out.println(2+3-6*4/8%2);
        // int a=10;
        // int p=19,q=8,r=5,s=45,t=10;
        // p+=a;
        // System.out.println(p);
        // q-=a;
        // System.out.println(q);
        // r*=2;
        // System.out.println(r);
        // s/=5;
        // System.out.println(s);
        // t%=2;
        // System.out.println(t);
        // int x=10,y=90;
        // System.out.println(x==y);
        // System.out.println(x>=y);
        // System.out.println(x<=y);
        // System.out.println(x>y);
        // System.out.println(x<y);
        // System.out.println(x!=y);
        // if(y>x && y!=10) System.out.println("true");
        // System.out.println((x>y)?true:false);
        // if(x%2==0) System.out.println("true");
        // else System.out.println("false");
        // if(15%3==0 && 15%5==0){
        //     System.out.println("true");
        // }
        // int n=2024;
        // if(n%400==0 && n%4==0 || n%100!=0)
        //     System.out.println("leap");
        int a = 29, b = 78;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 2);
        System.out.println(b >> 2);
        int x = 10, y = 9, z = 7;
        System.out.println((x > y) ? x : (x > z) ? y : z);
    }
}
