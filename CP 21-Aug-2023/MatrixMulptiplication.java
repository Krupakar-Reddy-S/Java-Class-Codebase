import java.util.*;

public class MatrixMulptiplication {

    public static boolean isValidMatrix(int[][]A){

        int Len = A[0].length;
        for(int i = 0; i < A.length; i++){
            if(A[i].length != Len){
                return false;
            }
        }

        return true;
    }
    
    public static int[][] matrixMulptiplication(int[][] A, int[][]B){

        int ADotB[][] = new int[A.length][B[0].length];

        if(isValidMatrix(A) && isValidMatrix(B)){

            if(A[0].length != B.length){
                throw new RuntimeException("The input matrix are of invalid dimensions to perform multiplication");
            }

            else{
                for(int i = 0; i < A.length; i++){
                    for(int j = 0; j < B[0].length; j++){
                        for(int k = 0; k < A[0].length ; k++){
                            ADotB[i][j] +=(A[i][k] * B[k][j]);
                        }
                    }
                }

                return ADotB;
            }

        }

        else{
            throw new RuntimeException("Invalid input for type matrix");
        }

        // return ADotB;

    }

    public static void main(String[] args) {

        int[][] A = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {1,2,3}
        };

        int[][] B = {
            {1,2},
            {3,4},
            {5,6}
        };
        
        int MultipliedMatrix[][] = matrixMulptiplication(A, B);

        System.out.println(Arrays.deepToString(MultipliedMatrix));
    }
}
