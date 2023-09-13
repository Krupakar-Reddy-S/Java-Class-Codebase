import java.util.*;

public class PrintOddFrequency {

    public static void printOddFrequency(int[] A){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < A.length; i++){
            int count  = 0;
            for(int j = 0; j < A.length; j++){
                if(A[i] == A[j]){
                    count++;
                }
            }

            if(count%2 != 0){
                set.add(A[i]);
            }
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 3, 6, 2, 4, 7, 2, 7 };

        printOddFrequency(A);
    }
}
