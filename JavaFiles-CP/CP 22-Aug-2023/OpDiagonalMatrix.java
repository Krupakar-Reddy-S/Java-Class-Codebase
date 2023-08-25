import java.util.*;

public class OpDiagonalMatrix {

    public static int[][] ArrayInput2d(int N, int M,Scanner sc){
        int [][] arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static void PrintOpDiagonal(int [][] A){
        
        // for(int i = 0; i < A.length; i++){
        //     for(int j = A.length-1; j >= 0; j--){
        //         if(i+j == A.length-1){
        //             System.out.println(A[i][j]);
        //         }
        //     }
        // }

        int start = 0;
        int end = A.length-1;
        while((start < A.length) && (end >= 0)){
            System.out.println(A[start][end]);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] Matrix = ArrayInput2d(N, N, sc);

        System.out.println("The opossite diagonal elements of the matrix are: ");
        PrintOpDiagonal(Matrix);

    }
}

