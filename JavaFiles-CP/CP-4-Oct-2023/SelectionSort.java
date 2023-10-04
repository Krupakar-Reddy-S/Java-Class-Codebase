import java.util.Arrays;

public class SelectionSort {

    // TC = O(N^2), SC = O(1)
    public static void selectionSort(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int minIndex = i;
            for(int j = i; j < A.length; j++) {
                if(A[minIndex] > A[j]) {
                    int temp = A[minIndex];
                    A[minIndex] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 5, -1, 2, 10, 3 };

        selectionSort(A);

        System.out.println(Arrays.toString(A));
    }
}
