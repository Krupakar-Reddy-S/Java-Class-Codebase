public class SubArraySumZero {

    /* 
     * Given an Array. Write a function which returns true if there exists
     * a Subarray having sum 0.
    */

    // TC = O(N^2), SC = O(1)
    public static boolean subArraySumZero(int[] A){
        for(int i = 0; i < A.length; i++){
            int Sum = A[i];
            for(int j = i+1; j < A.length; j++){
                if(Sum == 0){
                    return true;
                }
                Sum += A[j];
            }
            // System.out.println(Sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -3, 4, 5 };

        System.out.println("Array contains Subarray of sum 0: " + subArraySumZero(A));
    }
}