import java.util.*;

public class SumOfTwo {

    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();

        int List[] = arrayInput(N, sc);

        System.out.print("Enter the ");
    }
    

}
