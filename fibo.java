import java.util.*;
public class fibo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
  
       
        int a=0;
        int b=1;
        int c;
        for(int i=2;i<n;i++){
        c =a+b;
        a=b;
        b=c;
        }
         System.out.println(b);
         
    }
}
