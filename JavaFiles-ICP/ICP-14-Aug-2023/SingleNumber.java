import java.util.*;

class SingleNumber {

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

    public static int singleNumber(int[] array){

        for(int i = 0; i < array.length; i++){

            int Count = 0;
            Count = count(array,array[i]);

            if(Count == 1){
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();

        int List[] = arrayInput(N, sc);
        
        System.out.println("The number which occurs only once in the array is: " + singleNumber(List));
        sc.close();
    }
}