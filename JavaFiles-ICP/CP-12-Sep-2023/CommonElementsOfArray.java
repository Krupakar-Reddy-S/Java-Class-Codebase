import java.util.*;

public class CommonElementsOfArray {

    public static boolean Contains(int[] A, int N){
        for(int i = 0; i < A.length; i++){
            if(A[i] == N){
                return true;
            }
        }
        return false;
    } 

    public static void Common(int[] A, int[] B){
        for(int i = 0; i < A.length; i++){
            if( Contains(B, A[i])){
                System.out.print(A[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {2, 4, 3, 7, 8, 1, 10, 13, 15 };
        int[] B = {1, 2, 3, 6, 5, 13, 4, 9, 14, 10, 7 };

        Common(A, B);
        System.out.println();

        sc.close();
    }
}
