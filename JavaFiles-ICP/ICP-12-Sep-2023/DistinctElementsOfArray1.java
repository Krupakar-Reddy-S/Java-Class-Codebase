import java.util.*;

public class DistinctElementsOfArray1 {

    public static void distinct(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++) {
            if(! set.contains(A[i])){
                System.out.print(A[i] + " ");
                set.add(A[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1, 2, 3, 6, 5, 13, 3, 14, 6, 9, 14, 10, 7 };

        distinct(A);
        System.out.println();

        sc.close();
    }
}
