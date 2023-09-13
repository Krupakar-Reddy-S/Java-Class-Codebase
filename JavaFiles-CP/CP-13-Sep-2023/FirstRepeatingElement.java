import java.util.*;

public class FirstRepeatingElement {

    public static int firstRepeatingElemnet(int[] A){
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = A.length -1; i >= 0; i--){

            if(map.containsKey(A[i])){
                ans = A[i];
            }
            else{
                map.put(A[i], 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6 };

        System.out.println("First Repeating Elment in the Arrayis: " + firstRepeatingElemnet(A));
    }
}
