import java.util.*;

public class RotateArray {

    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static int[] arrayRotate(int[] array, int num){

        int size = array.length;
        num = num%size;

        for(int i = 0; i < num; i++){
            int[] newArray = new int[size];
            newArray[0] = array[size-1];

            for(int j = 1; j < size; j++){
                newArray[j] = array[j-1];
            }

            array = newArray;
        }
        return array;
    }

    public static void arrayRotateKN(int[] array, int num){

        num = num%array.length;
        for(int i = 0; i < num; i++){

            int temp = array[array.length - 1];
            for(int j = 1; j < array.length; j++){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();

        int List[] = arrayInput(N, sc);

        System.out.print("Enter the No. of rotations: ");
        int K = sc.nextInt();

        System.out.println(Arrays.toString(arrayRotate(List, K)));
    }
}
