import java.util.ArrayList;

public class Problem {

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> A) {
        for(int i = 0; i < A.size(); i++) {
            for(int j = i; j > 0; j--) {
                if(A.get(j) < A.get(j-1)) {
                    int temp = A.get(j);
                    A.set(j, A.get(j-1));
                    A.set(j-1, temp);
                }
                else {
                    break;
                }
            }
        }

        return A;
    }

    /* 
     * Given 2 sorted elements A[N] & B[M], Merge them into a new sorted array of size [N+M].
    */

    public static ArrayList<Integer> problem(int[] A, int[] B) {
        ArrayList<Integer> C = new ArrayList<Integer>();

        if(A.length > B.length) {
            for(int i = 0; i < A.length; i++) {
                C.add(A[i]);
            }

            int Count = 0;
            for(int i = A.length; i < C.size(); i++) {
                if(Count < B.length) {
                    C.add(B[Count]);
                    C = insertionSort(C);
                    Count++;
                }
            }
        }
        else {
            for(int i = 0; i < B.length; i++) {
                C.add(B[i]);
            }

            int Count = 0;
            for(int i = B.length; i < C.size(); i++) {
                if(Count < A.length) {
                    C.add(A[Count]);
                    C = insertionSort(C);
                    Count++;
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 12, 13 };
        int[] B = {2, 4, 5, 11 };

        System.out.println("Combined Sorted Array: " + problem(A, B));
    }
}
