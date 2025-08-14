import java.util.Random;

public class task3 {
    public static String passGenerator(int len) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(chars.length());
            pass.append(chars.charAt(index));
        }

        return pass.toString();
    }

    public static void main(String[] args) {
        System.out.println(passGenerator(6));
    }
}
