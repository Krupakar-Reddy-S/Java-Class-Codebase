import java.util.Arrays;

public class MergeSortInplace {

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
     * Space Complexity: O(1) - Merge sort sorts the Array in-place.
     * 
     * Unique Feature: Merge sort is a divide-and-conquer algorithm that divides the Array into smaller subArrays, sorts 
     *                 them, and then merges them back together in a stable manner.
     * 
    */

    public static void mergeInplace(int[] A, int s, int m, int e) {
        int[] merged = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e) {
            if(A[i] < A[j]) {
                merged[k] = A[i];
                i++;
            }
            else {
                merged[k] = A[j];
                j++;
            }

            k++;
        }

        while(i < m) {
            merged[k] = A[i];
            i++;
            k++;
        }

        while(j < e) {
            merged[k] = A[j];
            j++;
            k++;
        }

        for(int l = 0; l < merged.length; l++) {
            A[s+l] = merged[l];
        }
    }

    public static void mergeSortInplace(int[] A, int s, int e) {
        if(e - s == 1) {
            return;
        }

        int mid = (s+e)/2;

        mergeSortInplace(A, s, mid);
        mergeSortInplace(A, mid, e);

        mergeInplace(A, s, mid, e);
    }

    public static void main(String[] args) {
        int[] A = {23, 12, 1, 5, 6, 9, 13, 19, 7 };
        System.out.println("Original Array: " + Arrays.toString(A));

        mergeSortInplace(A, 0, A.length);

        System.out.println("Array After Merge Sort: " + Arrays.toString(A));
    }
}

