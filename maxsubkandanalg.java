public class maxsubkandanalg 

{
    static int maxsubarray(int[] a)    // function definition
    {
        int sum=0;                         // current subarray sum
        int maxsum=Integer.MIN_VALUE;      // stores maximum subarray sum

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];                 // add current element to running sum

            if(sum>maxsum)
                maxsum=sum;               // update maxsum if current sum is greater

            if(sum<0)
                sum=0;                    // reset sum if it becomes negative
    }
    return maxsum;                        // return final maximum sum
}

public static void main(String [] args){
         int a[] = {-2,1,-3,4,-1,2,1,-5,4};
         System.out.print(maxsubarray(a));     // function call
    }
}