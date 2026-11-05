import java.util.Scanner;

public class ThirdClass4or {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int button = sc.nextInt();

     switch(button) {
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3 : System.out.println("Bonjour");
        break;
        default : System.out.println("Invalid Button");
     }
}
}
// when many if & else statement are participate in code then i used switch method