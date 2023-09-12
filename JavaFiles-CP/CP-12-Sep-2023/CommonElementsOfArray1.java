import java.util.*;

public class CommonElementsOfArray1 {

    public static void Common(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<Integer>();
        
        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
        }

        HashSet<Integer> commonElements = new HashSet<Integer>();
        for (int i = 0; i < B.length; i++) {
            if (setA.contains(B[i])) {
                commonElements.add(B[i]);
            }
        }

        for (Integer element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {2, 4, 3, 7, 8, 1, 10, 13, 15};
        int[] B = {1, 2, 3, 6, 5, 13, 4, 9, 14, 10, 7};

        Common(A, B);
        System.out.println();

        sc.close();
    }
}
