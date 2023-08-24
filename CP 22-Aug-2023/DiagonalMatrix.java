import java.util.*;

public class DiagonalMatrix {

    public static int[][] ArrayInput2d(int N, int M,Scanner sc){
        int [][] arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static void PrintDiagonal(int [][] A){
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i][i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] Matrix = ArrayInput2d(N, N, sc);

        System.out.println("THe diagonal elements of the matrix are: ");
        PrintDiagonal(Matrix);

    }
}
