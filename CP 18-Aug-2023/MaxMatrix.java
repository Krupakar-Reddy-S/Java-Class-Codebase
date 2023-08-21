import java.util.Scanner;

public class MaxMatrix {

    public static int[][] ArrayInput2d(int N, int M,Scanner sc){
        int [][] arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static int MaxArray2d(int[][] arr, int N, int M){
        int Max = arr[0][0];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] > Max){
                    Max = arr[i][j];
                }
            }
        }
        return Max;
    }

    public static int MinArray2d(int[][] arr, int N, int M){
        int Min = MaxArray2d(arr, N, M);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] < Min){
                    Min = arr[i][j];
                }
            }
        }
        return Min;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of rows in the matrix: ");
        int N = sc.nextInt();

        System.out.print("Enter the No. of columns in the Matrix: ");
        int M = sc.nextInt();

        int [][] Array = ArrayInput2d(N, M, sc);

        System.out.println("The Maximum value of the Matrix is: " + MaxArray2d(Array, N, M));

        //System.out.println("The Maximum value of the Matrix is: " + MinArray2d(Array, N, M));

    }
}
