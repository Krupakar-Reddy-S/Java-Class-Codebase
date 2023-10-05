import java.util.*;

public class SearchInArray {

    public static boolean Contains(int[] A, int N){
        for(int i = 0; i < A.length; i++){
            if(A[i] == N){
                return true;
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {2, 4, 3, 7, 8, 1, 10, 13, 15, 2, 7, 8 };

        System.out.print("Enter the No. of Queries: ");
        int Queries = sc.nextInt();

        for(int i = 0; i < Queries; i++){
            System.out.print("Enter Element to Search: ");
            int N = sc.nextInt();
            System.out.println(Contains(A, N));
        }

        sc.close();
    }
}
