import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] A, int s, int mid, int e) {
        int[] merged = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (A[i] <= A[j]) {
                merged[k] = A[i];
                i++;
            }
            else {
                merged[k] = A[j];
                j++;
            }

            k++;
        }

        while (i < mid) {
            merged[k] = A[i];
            i++;
            k++;
        }

        while (j < e) {
            merged[k] = A[j];
            j++;
            k++;
        }

        for (int l = s; l < e; l++) {
            A[l] = merged[l - s];
        }
    }

    public static void mergeSort(int[] A, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSort(A, s, mid);
        mergeSort(A, mid, e);

        merge(A, s, mid, e);
    }

    public static void main(String[] args) {
        int[] A = {9, 8, 7, 6, 5, 4, 3, 2, 1 };

        mergeSort(A, 0, A.length);

        System.out.println(Arrays.toString(A));
    }
}
