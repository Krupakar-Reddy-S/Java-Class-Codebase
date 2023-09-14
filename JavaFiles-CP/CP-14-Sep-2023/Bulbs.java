import java.util.*;

public class Bulbs {

    /* 
     * A wire connects N light bulbs.
     * Each bulb has a switch associated with it, However due to a faulty wiring,
     * a switch also changes the state of all the bulbs to the right of the current bulb.
     * 
     * Return the least No. of switch toggles to make all bulbs glow.
     * 
     * N<=10^5
    */

    // TC = O(N^2), SC = O(N)
    public static int countToggles(boolean[] A){
        boolean[] all = new boolean[A.length];
        Arrays.fill(all, true);
        int Count = 0;

        for(int i = 0; i < A.length; i++){
            if(A.equals(all)){
                return Count;
            }

            else if(A[i] == false){
                A[i] = true;
                Count++;

                for(int j = i+1; j < A.length; j++){
                    if(A[j]){
                        A[j] = false;
                    }
                    else{
                        A[j] = true;
                    }
                }
            }
        }

        return Count;
    }

    public static void main(String[] args) {
        boolean[] A = {true, false, true, false, false};
        System.out.println("No. of toggles: " + countToggles(A));
    }
}
