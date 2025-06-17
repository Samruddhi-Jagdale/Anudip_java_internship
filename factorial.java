public class factorial {
    public static int fact(int a){
        int i;
        for (i=a-1;i>=1;i--){
            a=a*i;
        }
        System.out.println("Factorial:" + a);
        return a;
    }
    public static void main(String[] args) {
        fact(5); 
        
    }
}
