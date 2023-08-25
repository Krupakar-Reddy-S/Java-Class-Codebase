import java.util.*;

import java.util.Scanner;

public class TransposeMatrix {
    public static int[][] ArrayInput2d(int N, int M,Scanner sc){
        int [][] arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static void Transpose(int [][] A){
        for(int i = 0; i < A.length; i++){
            int temp;
            for(int j = 0; j < i; j++){
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [][] Matrix = ArrayInput2d(N, N, sc);
        Transpose(Matrix);

        System.out.println("The Transposed Matrix is: ");
        System.out.println(Arrays.deepToString(Matrix));


    }
}
