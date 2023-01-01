import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros{
    public static void main(String[] args) {
        int[][] matrix={
            {0,1,2,0},
            {3,4,5,2},
            {3,4,5,2},
            {1,3,1,5}
        };
        setZeroes(matrix);
    }
    static void setZeroes(int[][] matrix) {
        ArrayList<Integer> listRow=new ArrayList<>();
        ArrayList<Integer> listCol=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    listRow.add(i);
                    listCol.add(j);
                }
            }
        }

        for(int row:listRow){
            for(int i=0;i<matrix[row].length;i++){
                matrix[row][i]=0;
            }
        }

        for(int col:listCol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
        }

        for(int[] a:matrix){
            System.out.println(Arrays.toString(a));
        }
    }

    // static void setZero(int[][] mat,int row,int col){
      
    //     if(listRow.contains(row)|| listCol.contains(col)){
    //         return;
    //     }
    //     listRow.add(row);
    //     listCol.add(col);
    //     // System.out.println(listRow);
    //     // System.out.println(listCol);

    //     for(int i=0;i<mat[row].length;i++){
    //         mat[row][i]=0;
    //     }
    //     for(int i=0;i<mat.length;i++){
    //         mat[i][col]=0;
    //     }
    // }
}

//  Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//  Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]