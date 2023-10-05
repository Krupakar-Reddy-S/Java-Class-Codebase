import java.util.*;

public class AGpairs {

    /* 
     * Given a String find count of all pairs such that,
     * S(i) = 'a' and S(j) = 'g', for all j > i.
    */

    // TC = O(N^2), SC = O(N^2)
    public static int countAGpairs(String S){
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'a'){
                for(int j = i+1; j < S.length(); j++){
                    if(S.charAt(j) == 'g'){
                        ArrayList<Integer> arr = new ArrayList<Integer>();
                        arr.add(i);
                        arr.add(j);

                        A.add(arr);
                    }
                }
            }
        }
        // System.out.println(A);
        return A.size();
    }

    public static void main(String[] args) {
        String S = "abcgag";
        System.out.println("No. of Pairs: " + countAGpairs(S));
    }
}
