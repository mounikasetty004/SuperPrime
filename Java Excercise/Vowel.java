public  class Vowel{
    public static void main(String[] args) {
        String s="Qiscet";
        String str=s.toUpperCase();
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                flag=true;
            }
        }
        System.out.println(flag);
    }
}