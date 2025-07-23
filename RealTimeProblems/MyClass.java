public  class MyClass{
    public static void main(String[] args) {
        int n1=sum(new int[] {1,2,3,4,5});
        System.out.println(n1);
    }
    public static int sum(int a[]){
        int total=0;
        for(int i:a){
            total+=i;
        }
        return total;
    }
}