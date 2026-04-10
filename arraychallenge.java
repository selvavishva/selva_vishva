import java.util.Scanner;
public class arraychallenge {
    public static void main(String[] args) {

       
        Scanner scan = new Scanner(System.in);
           int[] num = new int[6];
        
       for (int i=1;i<=5;i++) {
        num[i]=scan.nextInt();
       }
       for(int i=1;i<=5;i++){
        System.out.println("number:"+num[i]);
       }


    }
}
