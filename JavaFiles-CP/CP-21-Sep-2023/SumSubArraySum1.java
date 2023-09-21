public class SumSubArraySum1{

    /* 
     * Givan an Array, Find the Sum of All Sub-Array sums.
     * 
     * EX: A = [1, 2, 3]
     * 
     * 1 => 1
     * 1,2 => 3
     * 1,2,3 => 6
     * 
     * 2 => 2
     * 2,3 => 5
     * 
     * 3 => 3
     * 
     * Sum = 1+3+6+2+5+3 => 20
     * 
     * Approach 2: (Contribution of every ith element)
     * 
     * A = [A0, A1, A2, A3, ...., Ai, Ai+1, ..., AN-1]
     * Start = i+1
     * end = N-i
     * 
     * Count of ith element = (i+1)*(N-i)
     * => Contributioj  of every ith elemetnt = A[i] * ((i+1)*(N-i))
     * 
    */

    // TC = O(N), SC = O(1)
    public static int sumSubArraySum(int[] A){
        int Sum = 0;
        for(int i = 0; i < A.length; i++){
            Sum += A[i] * ((i+1)*(A.length-i));
        }

        return Sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};

        System.out.println(sumSubArraySum(A));
    }
}
