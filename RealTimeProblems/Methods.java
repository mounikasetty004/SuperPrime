
public class Methods {

    public static void main(String[] args) {
        String str = "Mounika";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.compareTo("minni"));
        System.out.println(str.compareToIgnoreCase("mounika"));
        System.out.println(str.concat("nelisetty"));
        System.out.println(str.equals("mouni"));
        System.out.println(str.endsWith("ka"));
        System.out.println(str.startsWith("mo"));

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.err.println(sb);
        System.out.println(str.substring(4));
        System.out.println(str.contains("Mouni"));
    }
}
