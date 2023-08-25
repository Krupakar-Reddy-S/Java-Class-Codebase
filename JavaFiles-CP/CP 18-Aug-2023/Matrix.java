import java.util.*;

public class Matrix {

    public static int[][] ArrayInput2d(int N, int M,Scanner sc){
        int [][] arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static void print2d(int [][] arr, int N, int M, Scanner sc){

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print2dCol(int [][] arr, int N, int M, Scanner sc){

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of rows in the matrix: ");
        int N = sc.nextInt();

        System.out.print("Enter the No. of columns in the Matrix: ");
        int M = sc.nextInt();

        int [][] Array = ArrayInput2d(N, M, sc);

        System.out.println("The Matrix values are: ");
        
        print2dCol(Array, N, M, sc);
        System.out.println();



    }
}
