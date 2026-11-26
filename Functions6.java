

public class Functions6 {
     public static void checkPrime(int n) {
        if(n<=1) {
        return;
        }
        if(n<=3) {
         return;
        }
        for(int i=2; i*i <= n; i++) {
            if(n%i == 0) {
            return;
            }
        }

        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        System.out.println("Prime Number");

        for(int i = 1; i <= 100; i++) {
            checkPrime(i); 
        }
    }
   
}
