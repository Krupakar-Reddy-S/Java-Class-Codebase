import java.util.*;

public class RangeSumQueries{

    /* 
     * Given an array of N elements and Q queries.
     * For each quesry, Given L and R,
     * claculate and print the sum of all elements in the range [L, R], L & R inclusive.
    */

    // TC = O(N*Q), SC = O(1)
    public static ArrayList<Integer> rangeSumQueries(int[] A, int[][] Q){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < Q.length; i++){
            int L = Q[i][0];
            int R = Q[i][1];

            int Sum = 0;
            for(int j = L; j < R +1; j++){
                Sum += A[j];
            }

            arr.add(Sum);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {2, 3, 5, 1, 3, 5, 6, 9 };
        int[][] Q = {{1,5}, {3,4}, {5,5}, {4,6}, {0,4} };

        System.out.println(rangeSumQueries(A, Q));

        sc.close();
    }
}