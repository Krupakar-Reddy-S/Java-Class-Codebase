public class PrintArray {

    /* 
     * Given an Array  A, print its elements from A[0] to A[length-1] indices.
    */

    public static void printArray(int[] A, int start, int end) {
        if(start < A.length && start <= end) {
            System.out.print(A[start] + " ");
            printArray(A, start +1, end);
        }

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        printArray(A, 0, A.length -1);
        System.out.println();
    }
}