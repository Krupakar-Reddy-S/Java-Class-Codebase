import java.util.Arrays;

public class Problem2 {

    /* 
     * Given an Array of size N having all 0's,
     * and Q Queries having a start and an end index and a value.
     * Add the given value to all indices within the given range from start to end.
     * Return the final state ogf the Array.
     * 
    */

    // TC = O(N*Q), SC = O(1)
    public static int[] solution1(int[] A, int[][] Q){
        int[] arr = new int[A.length];
        
        for(int i = 0; i < Q.length; i++){
            int start = Q[i][0];
            int end = Q[i][1];
            int num = Q[i][2];

            for(int j = start; j <= end; j++){
                arr[j] = arr[j] + num;
            }
        }

        return arr;
    }

    public static int[] solution2(int[] A, int[][] Q){
        int[] arr = new int[A.length];

        return arr;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 0, 0, 0, 0, 0, 0};
        int[][] Q = {{5, 7,1}, {6, 7,3}, {1, 7,5}, {3, 7,-1}, {0, 7,1}};

        System.out.println("Output Array " + Arrays.toString(solution1(A, Q)));
    }
}
