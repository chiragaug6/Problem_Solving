import java.util.Arrays;
//if we given condition here, that matrix is always n*n order then we dont require extra space
public class Transpose_of_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        transpose(matrix);
    }

    static void transpose(int[][] matrix){
        int[][] tran=new int[matrix[0].length][matrix.length];
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                tran[col][row]=matrix[row][col];
            }
        }

        for(int[] arr :tran){
            System.out.println(Arrays.toString(arr));
        }
    }
}
