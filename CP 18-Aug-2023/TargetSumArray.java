import java.util.*;

public class TargetSumArray {

    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static int[] targetSum(int[] arr, int N){

        Arrays.sort(arr);
        int[] Index = new int[2];

        for(int i = 0; i < arr.length; i++){

            int first = 0;
            int last = arr.length-1;

            if(arr[first] + arr[last] == N){
                Index[0] = first;
                Index[1] = last;
            }
            else if(arr[first] + arr[last] > N){
                last--;
            }
            else if(arr[first] + arr[last] < N){
                first ++;
            }
        }

        return Index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();

        int List[] = arrayInput(N, sc);

       // System.out.print();

    }
}
