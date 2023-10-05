import java.util.*;

class CountSmaller {

    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static int MaxArray(int[] array){
        int Max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > Max){
                Max = array[i];
            }
        }
        return Max;
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

    public static int countSmaller(int[] array){
        int Max = MaxArray(array);
        int Count = count(array, Max);

        return (array.length - Count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();

        int List[] = arrayInput(N, sc);
        
        System.out.println("The No. of elements having atleast one element greater than themselves is: " + countSmaller(List));
        sc.close();
    }
}