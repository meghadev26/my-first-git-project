import java.util.Scanner;
public class FirstHomework {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int x = sc.nextInt();

         int sum = a + b;
         System.out.println(sum);

         int diff = a - b;
         System.out.println(diff);

         int mul = a * b;
         System.out.println(mul);

         int div = a / b;
         System.out.println(div);

         int modulo = a % b;
         System.out.println(modulo);
    }
}
