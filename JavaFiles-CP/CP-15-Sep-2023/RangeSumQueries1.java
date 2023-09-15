import java.util.*;

public class RangeSumQueries1 {

    /* 
     * Given an array of N elements and Q queries.
     * For each quesry, Given L and R,
     * claculate and print the sum of all elements in the range [L, R], L & R inclusive.
    */

    // TC = O(N+Q), SC = O(N)
    public static void rangeSumQueries(int[] A, int[][] Q){
        ArrayList<Integer> prefixSum = new ArrayList<Integer>();

        prefixSum.add(0);
        int Sum = 0;
        for(int i = 0; i < A.length; i++){
            Sum += A[i];
            prefixSum.add(Sum);
        }

        for(int j = 0; j < Q.length; j++){
            int L = Q[j][0];
            int R = Q[j][1];

            System.out.print(prefixSum.get(R+1) - prefixSum.get(L) + " ");
        }

        // System.out.println(prefixSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {2, 3, 5, 1, 3, 5, 6, 9 };
        int[][] Q = {{1,5}, {3,4}, {5,5}, {4,6}, {0,4} };

        rangeSumQueries(A, Q);
        System.out.println();

        sc.close();
    }
}