import java.util.Random;

public class RandomAlphabetGenerator {
    public static char getRandomAlphabet() {
        Random r = new Random();
        int randomNum = r.nextInt(26); 
        return (char) ('a' + randomNum); 
    }
    public static void main(String[] args) {
        String res="";
        for(int i=0;i<12;i++){
            if(i<3)
                res+=getRandomAlphabet();
            else if(i==3 || i==8)
                res+='-';
            else
                res+=getRandomAlphabet();
        }
        System.out.println("google meet link " + res);
    }
}