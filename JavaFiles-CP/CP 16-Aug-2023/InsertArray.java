import java.util.*;

public class InsertArray {

    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static int[] insertArray(int[] array, int size, int num){

        if(size < array.length){

            array[size] = num;
            return array;
        }

        int[] newArray = new int[array.length + 1];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = num;
        array = newArray;

        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();

        int List[] = arrayInput(N, sc);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the element to add to the array: ");
        int num = sc.nextInt();

        System.out.println("The new array after adding element " + num + " is: " + Arrays.toString(insertArray(List, size, num)));
    }
}

