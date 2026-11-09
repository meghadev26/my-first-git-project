import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 90) {
            System.out.println("this is Good");
        } else if(marks <= 89 && marks >= 60) {
            System.out.println("This is also Good");
        } else if(marks <= 59 && marks >= 0) {
            System.out.println("This is Good as well");
        } else {
        System.out.println("Invalid Marks");
    }
        
    }
}
    
