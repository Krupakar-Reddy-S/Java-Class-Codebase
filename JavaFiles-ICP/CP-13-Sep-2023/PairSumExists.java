import java.util.*;

public class PairSumExists{

    public static boolean pairSum(int[] A, int B){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < A.length; i++){
            if(set.contains(B - A[i])){
                return true;
            }
            set.add(A[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {1, 3, 2, 5, 7, 11, 9, 10, 8, 15, 27, 36, 42 };

        System.out.print("Enter Number to find if Sum Pair exists in Array: ");
        int B = sc.nextInt();

        System.out.println(pairSum(A, B));

        sc.close();
    }
}
