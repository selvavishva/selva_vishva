public class matrtranspose {
    public static void main(String []args){
        int [][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
         
        int [][]tr= new int[3][3];     // Create a new matrix to store the transpose

        // Traverse rows and columns of original matrix
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++){
                tr[row][col]=arr[col][row]; // Swap row and column indices to get transpose
            }
        }

        // Print the transposed matrix
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++){
                System.out.print(tr[row][col]+ " ");   // Print each element
            }
            System.out.println();         // Move to next line after each row
        }
    }
}
}
