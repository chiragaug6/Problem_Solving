import java.util.Arrays;

// Algorithm

// Step 1 :Find Transpose of matrix

// Step 2 :Reverse Every Row


public class Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotate(matrix);
    }

    static void rotate(int[][] matrix) {
        // Algorithm
        // 1=> find transpose of matrix
        // 2-> reverse every row

        // find transpose of matrix
        for(int row=0;row<matrix.length;row++){
            for(int col=row;col<matrix[0].length;col++){
                swap(row,col,matrix);
            }
        }

        // reverse every row

        for (int[] ints : matrix) {
            reverse(ints);
        }
    }

    static void swap(int row,int col,int[][] matrix){
        int temp=0;
        temp=matrix[row][col];
        matrix[row][col]=matrix[col][row];
        matrix[col][row]=temp;
    }

    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
