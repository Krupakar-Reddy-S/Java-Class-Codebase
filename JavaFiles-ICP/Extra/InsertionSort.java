import java.util.Arrays;

public class InsertionSort {

    /* 
     * Insertion Sort:
     * 
     * Working: Insertion sort builds the final sorted Array one item at a time. It takes each element and inserts it into 
     *          its correct position among the already sorted elements.
     * 
     * Stability: Insertion sort is a stable sorting algorithm.
     * 
     * Time Complexity(Best): O(n) - Occurs when the Array is nearly sorted.
     * 
     * Time Complexity(Worst): O(n^2) - Occurs when the Array is sorted in reverse order.
     * 
     * Space Complexity: O(1) - Insertion sort sorts the Array in-place.
     * 
     * Unique Feature: Insertion sort builds the final sorted array one item at a time, inserting each element into its 
     *                 correct position.
     * 
    */

    public static void swap(int[] A, int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    public static void insertionSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(A[j] < A[j-1]){
                    swap(A, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {23, 12, 1, 5, 6, 9, 13, 19, 7 };
        System.out.println("Original Array: " + Arrays.toString(A));

        insertionSort(A);

        System.out.println("Array After Insertion Sort: " + Arrays.toString(A));
    }
}
