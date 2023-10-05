import java.util.Arrays;

public class BubbleSort {

    /* 
     * Bubble Sort:
     * 
     * Working: Bubble sort repeatedly iterates through the Array, comparing adjacent elements, and swaps them 
     *          if they are in the wrong order. This process continues until no more swaps are needed.
     * 
     * Stability: Bubble sort is a stable sorting algorithm.
     * 
     * Time Complexity(Best): O(n) - This occurs when the Array is already sorted.
     * 
     * Time Complexity(Worst): O(n^2) - This happens when the Array is sorted in reverse order.
     * 
     * Space Complexity: O(1) - Bubble sort sorts the Array in-place.
     * 
     * Unique Feature: Bubble sort continuously swaps adjacent elements until the largest unsorted element 
     *                 "bubbles up" to its correct position.
     * 
    */

    public static void bubbleSort(int[] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 1; j < A.length - i; j++){
                if(A[j] < A[j-1]){
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] A = {23, 12, 1, 5, 6, 9, 13, 19, 7 };
        System.out.println("Original Array: " + Arrays.toString(A));

        bubbleSort(A);

        System.out.println("Array After Bubble Sort: " + Arrays.toString(A));

    }
}
