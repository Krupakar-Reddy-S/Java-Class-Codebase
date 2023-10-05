import java.util.Arrays;

public class Problem {

    // TC = O(N), SC = O(N)
    public static void problem(int[] A, int l, int m, int r) {
        int[] B = new int[r-l+1];

        int i = l;
        int j = m+1;
        int k = 0;

        while(i <= m && j <= r) {
            if(A[i] < A[j]) {
                B[k] = A[i];
                i++;
            }
            else {
                B[k] = A[j];
                j++;
            }
            
            k++;
        }

        while (i <= m) {
            B[k] = A[i];
            i++;
            k++;
        }

        while (j <= r) {
            B[k] = A[j];
            j++;
            k++;
        }

        for(int n = l; n <= r; n++){
            A[n] = B[n-l];
        }
    }

    public static void main(String[] args) {
        int[] A = {8, 1, 3, 6, 11, 2, 4, 9, 7, 6 };

        problem(A, 2, 4, 7);

        System.out.println(Arrays.toString(A));
    }
}