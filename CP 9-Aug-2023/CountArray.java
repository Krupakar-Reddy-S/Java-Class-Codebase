import java.util.Scanner;

public class CountArray {
    
    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static int count(int[] Array,int element){

        int count = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] == element){
                count+=1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int Count = sc.nextInt();

        int[] array = arrayInput(Count,sc);

        System.out.print("Enter the element to search in the array: ");
        int element = sc.nextInt();

        System.out.println("The count of " + element + " in the array is: " + count(array,element));

        sc.close();
    }
}
