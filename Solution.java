import java.lang.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int[] B = new int[N];
        int j = N;

        for(int i = 0; i < N;i++){
            B[j - i] = A[i];
            j-=i;
        }

        for(int i = 0;i < B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}