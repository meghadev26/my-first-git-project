import java.util.Scanner;

public class Loops6or {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i = i + 2) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            
        }

    } 
}
