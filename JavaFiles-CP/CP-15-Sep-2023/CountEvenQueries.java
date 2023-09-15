import java.util.ArrayList;

public class CountEvenQueries {

    /* 
     * Given an array arr of N elements and Q queries. For each query, given L & R,
     * Calculate and print the number of even numbers in given range i.e, [L, R].
    */

    // TC = O(N+Q), SC = O(N)
    public static void countEvenQueries(int[] A, int[][] Q){
        ArrayList<Integer> prefixSum = new ArrayList<Integer>();

        if(A[0]%2 == 0){
            prefixSum.add(1);
        }
        else{
            prefixSum.add(0);
        }

        int Sum = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]%2 == 0){
                Sum++;
            }
            prefixSum.add(Sum);
        }

        for(int j = 0; j < Q.length; j++){
            int L = Q[j][0];
            int R = Q[j][1];

            System.out.println(prefixSum.get(R+1) - prefixSum.get(L) + " ");
        }

    }

    public static void main(String[] args) {
        int[] A = {};
        int[][] Q = {};

        countEvenQueries(A, Q);
        System.out.println();
    }
}
