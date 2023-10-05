import java.util.Arrays;

public class Problem1 {

    /* 
     * Given an Array of size N having all 0's,
     * and Q Queries having index and value.
     * Add the given value to all indices >= the given index.
     * Return the final state ogf the Array.
     * 
     * EX: [0, 0, 0, 0, 0, 0, 0, 0]
     * 
     * Q: 5
     * i    V
     * 5    1   [0, 0, 0, 0, 0, 1, 1, 1]
     * 6    3   [0, 0, 0, 0, 0, 1, 4, 4]
     * 1    5   [0, 5, 5, 5, 5, 6, 9, 9]
     * 3    -1  [0, 5, 5, 4, 4, 5, 8, 8]
     * 0    1   [1, 6, 6, 5, 5, 6, 9, 9]
     * 
    */
    
    // TC = O(N*Q), SC(1)
    public static int[] solution1(int[] A, int[][] Q){
        int[] arr = new int[A.length];

        for(int i = 0; i < Q.length; i++){
            int index = Q[i][0];
            int num = Q[i][1];

            for(int j = index; j < A.length; j++){
                arr[j] = arr[j] + num;
            }
        }

        return arr;
    }

    // TC = O(N+Q), SC = O(1)
    public static int[] solution2(int[] A, int[][] Q){
        int[] arr = new int[A.length];

        return arr;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 0, 0, 0, 0, 0, 0};
        int[][] Q = {{5,1}, {6,3}, {1,5}, {3,-1}, {0,1}};

        System.out.println("Output Array " + Arrays.toString(solution1(A, Q)));
    }
}
