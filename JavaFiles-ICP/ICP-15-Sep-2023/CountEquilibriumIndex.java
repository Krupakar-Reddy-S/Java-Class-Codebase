import java.util.ArrayList;

public class CountEquilibriumIndex {

    /* 
     * Given an array of N elements, return the total count of equilibrium index.
     * An Index i is said to be equilibrium if:
     * 
     * Sum of all elements on left of the ith index = Sum of all elements on right side of the ith index.
     * 
    */

    // TC = O(N), SC = O(N)
    public static int countEquilibriumIndex(int[] A){
        ArrayList<Integer> prefixSum = new ArrayList<Integer>();

        prefixSum.add(0);
        int Sum = 0;
        for(int i = 0; i < A.length; i++){
            Sum += A[i];
            prefixSum.add(Sum);
        }

        int Count = 0;

        for(int j = 0; j < A.length; j++){
            if(prefixSum.get(j) == (prefixSum.get(A.length) - prefixSum.get(j+1))){
                Count++;
            }
        }

        return Count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5, 1, 5};

        System.out.println("No. of Equilibium Index in Array: " + countEquilibriumIndex(A));
    }
}
