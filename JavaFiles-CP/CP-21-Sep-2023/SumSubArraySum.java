public class SumSubArraySum{

    /* 
     * Givan an Array, Find the Sum of All Sub-Array sums.
     * 
     * EX: A = [1, 2, 3]
     * 1 => 1
     * 1,2 => 3
     * 1,2,3 => 6
     * 2 => 2
     * 2,3 => 5
     * 3 => 3
     * 
     * Sum = 1+3+6+2+5+3 => 20
     * 
    */

    // TC = O(N^3), SC = O(1)
    public static int sumSubArraySum(int[] A){
        int Sum = 0;

        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                for(int k = i; k <= j; k++){
                    Sum += A[k];
                }
            }
        }

        return Sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};

        System.out.println(sumSubArraySum(A));
    }
}