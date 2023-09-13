import java.util.Arrays;

public class BubbleSort {

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
