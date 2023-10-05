import java.util.Arrays;

public class InsertionSort {

    /* 
     * Preferred Algorithm if Array is very small, or Array is almost sorted.
    */

    // TC = O(N^2), SC = O(1)
    public static void insertionSort(int[] A) {
        for(int i = 0; i < A.length; i++) {
            for(int j = i; j > 0; j--) {
                if(A[j] < A[j-1]) {
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {7, 5, 10, 2, -1, 3 };

        insertionSort(A);

        System.out.println(Arrays.toString(A));
    }
}
