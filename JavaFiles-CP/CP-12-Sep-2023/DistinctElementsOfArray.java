import java.util.*;

public class DistinctElementsOfArray {

    public static boolean Contains(int[] A, int N){
        for(int i = 0; i < A.length; i++){
            if(A[i] == N){
                return true;
            }
        }
        return false;
    } 

    public static void distinct(int[] A) {
        for(int i = 0; i < A.length; i++) {
            
            int[] A1 = new int[i];
            for(int j = 0; j < A1.length; j++) {
                A1[j] = A[j];
            }

            if(! Contains(A1, A[i])){
                System.out.print(A[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1, 2, 3, 6, 5, 13, 3, 4, 6, 9, 14, 10, 7 };

        distinct(A);
        System.out.println();

        sc.close();
    }
}
