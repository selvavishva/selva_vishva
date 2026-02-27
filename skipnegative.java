public class skipnegative {
    public static void main(String[] args) {
        int[] arr={10,-5,20,-3,15};
        int n=0;
        while(n<arr.length){
            if(arr[n]>=0){
                System.err.println(arr[n]);
            }
            n++;
        }
    }
}
