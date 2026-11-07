public class Loops {
    public static void main(String[] args) {
         for(int counter = 0; counter < 50; counter = counter + 1) {
            System.out.println("Hello World");
         }
    }
}
// If I remove "counter < 50" in line number 3 then
//  this output will turn into an "infinite loops" conditions and "Hello World" keep printing 
// for long time until our laptop memory is full.
