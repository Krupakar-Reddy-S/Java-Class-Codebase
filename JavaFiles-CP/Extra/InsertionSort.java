import java.util.Arrays;

public class InsertionSort {

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
