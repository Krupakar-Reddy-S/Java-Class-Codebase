import java.util.Arrays;

public class KthMinimum {

    /* 
     * Given an unsorted Array, Find the Kth Minimum element (0 < K < log N).
    */

    // TC = O(N * log N), SC = O(1)
    public static int kThMinimum(int[] A, int K) {
        Arrays.sort(A);
        int Count = 0;

        for(int i = 0; i < A.length; i++) {
            if(Count == K) {
                return A[i-1];
            }

            if(A[i] < A[i+1] && i != A.length -1) {
                Count++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, -1, 2, 10, 3 };

        System.out.println("Kth Minimum element of an Array is: " + kThMinimum(A, 3));
    }
}