import java.util.Arrays;

public class MergeSort {

    /* 
     * Merge Sort:
     * 
     * Working: Merge sort is a divide-and-conquer algorithm. It divides the Array into smaller subArrays, recursively sorts 
     *          them, and then merges them back together in a sorted manner.
     * 
     * Stability: Merge sort is a stable sorting algorithm.
     * 
     * Time Complexity(Best): O(n log n) - Occurs for all cases.
     * 
     * Time Complexity(Worst): O(n log n) - Also occurs for all cases.
     * 
     * Space Complexity: O(n) - Merge sort requires additional memory proportional to the size of the input Array.
     * 
     * Unique Feature: Merge sort is a divide-and-conquer algorithm that divides the Array into smaller subArrays, sorts 
     *                 them, and then merges them back together in a stable manner.
     * 
    */

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            }
            else {
                merged[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }

    public static int[] mergeSort(int[] A) {
        if(A.length == 1) {
            return A;
        }

        int mid = A.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(A, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(A, mid, A.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] A = {23, 12, 1, 5, 6, 9, 13, 19, 7 };
        System.out.println("Original Array: " + Arrays.toString(A));

        A = mergeSort(A);

        System.out.println("Array After Merge Sort: " + Arrays.toString(A));
    }
}
