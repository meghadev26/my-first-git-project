import java.util.Scanner;

public class Functions10 {
     //Recursion Example
    public static int sum(int n) {
        // Base case: stops recursion when n is 0 or 1
        if (n <= 1) {
            return 1;
        }

        // Recursive case: calls itself with a smaller input (n - 1)
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(sum(n));

         sum(n);
    }
}
