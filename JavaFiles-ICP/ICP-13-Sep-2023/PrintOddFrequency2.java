import java.util.*;

public class PrintOddFrequency2 {

    public static void printOddFrequency(int[] A){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                int Frequency = map.get(A[i]);
                map.put(A[i], Frequency + 1);
            }
            else{
                map.put(A[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()%2 != 0){
                System.out.print(e.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 3, 6, 2, 4, 7, 2, 7 };

        printOddFrequency(A);
        System.out.println();
    }
}

