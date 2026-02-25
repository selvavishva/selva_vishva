import java.util.*;
class Even{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
        while (num>0) {
            if(num%2==0){
                System.out.println("Even");
                break;
            }
            else if(num%2!=0){
                  System.out.println("odd");
                  break;
            }
           
        }
        
    }
}