import java.util.Arrays;

public class CycleSort {

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
