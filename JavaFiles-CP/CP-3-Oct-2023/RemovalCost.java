import java.util.Arrays;
import java.util.Collections;

public class RemovalCost {

    /* 
     * 
    */

    // TC = O(N), SC = O(1)
    public static int removalCost(Integer[] A) {
        Arrays.sort(A, Collections.reverseOrder());
        int Cost = 0;
        int Count = 1;

        for(int i = 0; i < A.length; i++) {
            Cost += (A[i] * Count);
            Count++;
        }

        return Cost;
    }

    public static void main(String[] args) {
        Integer[] A = {2, 1, 4 };

        System.out.println("Cost of Removing all elements: " + removalCost(A));
    }
}