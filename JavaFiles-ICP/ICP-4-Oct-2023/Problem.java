public class Problem {

    /* 
     * Given 2 sorted elements A[N] & B[M], Merge them into a new sorted array of size [N+M].
    */

    public static int[] problem(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } 
            else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 12, 13 };
        int[] B = {2, 4, 5, 11 };

        System.out.println("Combined Sorted Array: " + problem(A, B));
    }
}
