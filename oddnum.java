public class oddnum {
    public static void main(String[] args) {
        int n=1;
        while(n<=10){
            if(n%2!=0){
                n++;
                continue;
            }

            System.out.println(n);
            n++;
        }
    }
}
