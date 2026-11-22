public class Pattern22 {
     public static void main(String[] args) {
        int n=5;
        

    for(int i=0; i<n; i++) {
        //middle space
        for(int j=0; j<n-i-1; j++) {
            System.out.print(" ");
        }
        //for pyramid
        int m=1;
        for(int j=0; j<=i; j++) {
            System.out.print(m+" ");
            m = m*(i-j)/(j+1);
        }
        System.out.println();
    }
    
        
}
}
    