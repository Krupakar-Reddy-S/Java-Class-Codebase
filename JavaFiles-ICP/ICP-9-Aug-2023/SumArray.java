import java.util.*;

public class SumArray {
    
    public static int[] arrayInput(int size){
        Scanner sc = new Scanner(System.in);
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        sc.close();

        return Array;
    }

    public static int arraySum(int[] List){

        int sum = 0;
        for(int i = 0; i < List.length; i++){
            sum+=List[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");

        int Count = sc.nextInt();
        int[] array = arrayInput(Count);

        System.out.print("The Array of marks entered is: ");
        System.out.println(Arrays.toString(array));

        System.out.println("The sum of elements of the array is: " + arraySum(array));

        sc.close();
    }
}
