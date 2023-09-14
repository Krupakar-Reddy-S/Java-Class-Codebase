import java.util.*;

public class AGpairs1 {

    /* 
     * Given a String find count of all pairs such that,
     * S(i) = 'a' and S(j) = 'g', for all j > i.
    */

    // TC = O(N^2), SC = O(N)
    public static int countAGpairs(String S){
        int Count = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'a'){
                String sub = S.substring(i+1);
                int count = (int) (sub.chars().filter(ch -> ch == 'g').count());
                Count += count;
            }
        }
        return Count;
    }

    public static void main(String[] args) {
        String S = "abcgag";
        System.out.println("No. of Pairs: " + countAGpairs(S));
    }
}