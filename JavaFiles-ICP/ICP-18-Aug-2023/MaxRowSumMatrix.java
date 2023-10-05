import java.util.*;

public class MaxRowSumMatrix {

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

    public static int MaxRowSum(int[][] arr, int N, int M,Scanner sc){


        int MaxRowSum = MaxArray2d(arr, N, 1);
        int IndexMaxRowSum = 0;

        for(int i = 0; i < N; i++){
            int RowSum = 0;

            for(int j = 1; j < M; j++){
                RowSum += arr[i][j];
            }

            if(RowSum > MaxRowSum){
                MaxRowSum = RowSum;
                IndexMaxRowSum = i;
            }
        }

        return IndexMaxRowSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of rows in the matrix: ");
        int N = sc.nextInt();

        System.out.print("Enter the No. of columns in the Matrix: ");
        int M = sc.nextInt();

        int [][] Array = ArrayInput2d(N, M, sc);

        System.out.println("The Index of row with Maximum sum is: " + MaxRowSum(Array, N, M, sc));
    }
    
}
