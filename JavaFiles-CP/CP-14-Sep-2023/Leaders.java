import java.util.*;

public class Leaders {

    /*
     * Given an array of size N, return count of leaders in the array.
     * A[i] is a leader if it is strictly greater than all A[0, i-1].
    */

    // TC = O(N), SC = O(1)
    public static int leadersCount(int[] A){
        int Leaders = 0;
        int max = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] > max){
                max = A[i];
                Leaders++;
            }
        }

        return Leaders;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 1, 7, 9, 12, 45, 6, 2 };
        System.out.println("No. of Leaders in given Array: " + leadersCount(A));
    }
}
