import java.util.*;

public class AGpairs2 {

    /* 
     * Given a String find count of all pairs such that,
     * S(i) = 'a' and S(j) = 'g', for all j > i.
    */

    // TC = O(N), SC = O(1)
    public static int countAGpairs(String S){
        int Count = 0;
        int gCount = 0;

        for(int i = S.length()-1; i >= 0; i--){
            if(S.charAt(i) == 'g'){
                gCount++;
            }
            else if(S.charAt(i) == 'a'){
                Count += gCount;
            }
        }
        return Count;
    }

    public static void main(String[] args) {
        String S = "abcgag";
        System.out.println("No. of Pairs: " + countAGpairs(S));
    }
}