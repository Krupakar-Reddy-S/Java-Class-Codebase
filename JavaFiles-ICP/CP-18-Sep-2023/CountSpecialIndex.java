public class CountSpecialIndex {

    /* 
     * Count of Special Indices
     * 
     * NOTE: Special Indices are those after removing which, sum of all EVEN indexed
     * elements is rqual to sum of all ODD indexed elements.
    */

    // TC = O(N^2), SC = O(1)
    public static int countSpecialIndex(int[] A){
        int Count = 0;
        for(int i = 0; i < A.length; i++){
            int sumEven = 0;
            int sumOdd = 0;
            for(int j = 0; j< A.length; j++){
                if(j < i){
                    if(j%2 == 0){
                        sumEven += A[j];
                    }
                    else if(j%2 != 0){
                        sumOdd += A[j];
                    }
                }
                else if(j > i){
                    if(j%2 == 0){
                        sumOdd += A[j];
                    }
                    else if(j%2 != 0){
                        sumEven += A[j];
                    }
                }
            }

            // System.out.println(sumEven + " " + sumOdd);
            if(sumEven == sumOdd){
                Count++;
            }
        }

        return Count;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 7, 6, -2 };

        System.out.println("Count of Special Indices in given Array is: " + countSpecialIndex(A));
    }
}
