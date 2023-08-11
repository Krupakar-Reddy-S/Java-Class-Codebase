import java.util.Scanner;

public class SearchArray {
    
    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static boolean search(int[] Array,int element){

        for(int i = 0; i < Array.length; i++){
            if(Array[i] == element){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int Count = sc.nextInt();

        int[] array = arrayInput(Count,sc);

        System.out.print("Enter the element to search in the array: ");
        int element = sc.nextInt();

        boolean presence = search(array,element);

        if(presence){
            System.out.println("The given element " + element + " is present in the array.");
        }
        else{
            System.out.println("The given element " + element + " is Not present in the array.");
        }

        sc.close();
    }
}
