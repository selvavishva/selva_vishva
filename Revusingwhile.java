public class Revusingwhile {
    public static void main(String[] args) {
        int n=153;
        int rev=0;
        while(n>0){ //try in for loop
        int d=n%10;
         rev=rev*10+d;
        n=n/10;
        }
        System.out.print(rev);
    }
}
