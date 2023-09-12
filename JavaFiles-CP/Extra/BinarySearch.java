import java.util.*;

public class BinarySearch{

    public static int binarySearch(int[] A, int N){
        int start = 0;
        int end = A.length -1;

        while(start <= end){
            int num = start + (end - start)/2;

            if(A[num] < N){
                start = num + 1;
            }

            else if(A[num] > N){
                end = num -1;
            }

            else{
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {1, 3, 4, 6, 7, 9, 11, 13, 14, 23, 39, 45, 63, 78, 93, 101};

        System.out.print("Enter number to search in the Array: ");
        int N = sc.nextInt();

        System.out.println("Index of element " +  N + " in the array is: " + binarySearch(A, N));

        sc.close();
    }
}