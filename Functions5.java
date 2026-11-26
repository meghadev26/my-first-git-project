import java.util.Scanner;
public class Functions5 {
    public static void checkPrime(int n) {
        if(n<=1) {
            System.out.println("Not Prime Number");
            return;
        }
        if(n<=3) {
            System.out.println("Prime Number");
            return;
        }
        for(int i=2; i*i <= n; i++) {
            if(n%i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPrime(n);
    }
}
