import java.util.*;

public class PrintOddFrequency1 {

    public static void printOddFrequency(int[] A){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < A.length; i++){
            if(! set.contains(A[i])){
                set.add(A[i]);
            }
            else{
                set.remove(A[i]);
            }
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 3, 6, 2, 4, 7, 2, 7 };

        printOddFrequency(A);
    }
}
