import java.util.*;

public class SecondClass5 {
   public static void main(String[] args) {
    //Input
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    //nextInt()
    //nextFloat()
    //nextDouble()
    System.out.println(name);
// after write 11 no line then click run then write megha(any other name) in terminal in bellow then press enter botton
// if i write full name like megha mohuri .so when i will press enter botton then prints only megha not megha mohuri
//because 'next' word in 7 no line will aslways take 1 token for each word and here too many words(megha mohuri) so print only 
//megha not megha mohuri
// the solution is write 'nextline' in 7 no line . like this bellow
//System name = sc.nextline();
   } 
}