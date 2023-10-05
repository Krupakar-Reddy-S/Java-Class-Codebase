import java.util.Arrays;

public class CycleSort {

    /* 
     * Cycle Sort:
     * 
     * Working: Cycle sort minimizes the number of writes to the original Array. It works by finding cycles of elements 
     *          that need to be rotated to their correct positions.
     * 
     * Stability: Cycle sort is a stable sorting algorithm.
     * 
     * Time Complexity(Best): O(n^2) - This is the worst-case scenario.
     * 
     * Time Complexity(Worst): O(n^2) - This occurs when elements require multiple cycles.
     * 
     * Space Complexity: O(1) - Cycle sort sorts the Array in-place.
     * 
     * Unique Feature: Cycle sort minimizes the number of writes to the original Array, making it useful for systems with 
     *                 limited write capabilities.
     * 
    */

    public static void swap(int[] A, int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    public static void cycleSort(int[] A) {
        int i = 0;
        while (i < A.length) {
            int correct = A[i] -1;

            if(A[i] != A[correct]){
                swap(A, i, correct);
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {6, 9, 4, 1, 7, 3, 5, 2, 8, 10};
        System.out.println("Original Array: " + Arrays.toString(A));

        cycleSort(A);

        System.out.println("Array After Cycle Sort: " + Arrays.toString(A));
    }
}
