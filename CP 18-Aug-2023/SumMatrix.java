import java.util.Scanner;

public class SumMatrix {

    public static int[][] ArrayInput2d(int N, int M,Scanner sc){
        int [][] arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static int SumArray2d(int[][] arr, int N, int M){
        int Sum = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                    Sum += arr[i][j];
            }
        }
        return Sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of rows in the matrix: ");
        int N = sc.nextInt();

        System.out.print("Enter the No. of columns in the Matrix: ");
        int M = sc.nextInt();

        int [][] Array = ArrayInput2d(N, M, sc);

        System.out.println("The Sum of elements of the Matrix is: " + SumArray2d(Array, N, M));

    }
}

