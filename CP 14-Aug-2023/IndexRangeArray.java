import java.util.*;

class IndexRangeArray {

    public static int[] arrayInput(int size,Scanner sc){
        int[] Array =  new int[size];
        int num = 0;

        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            Array[i] = num;
        }

        return Array;
    }

    public static void IndexRange(int[] list, int target){
        int i = 0;
        for(i = 0; i < list.length; i++){
            if(list[i] == target){
                System.out.print("The range of index in which " + target + " is found " + i + ",");
                break;
            }
        }

        for(int j = i+1; j < list.length; j++){
            if(list[j] == target){
            }
            else{
                System.out.println(j-1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of elements in the array: ");
        int N = sc.nextInt();


        int List[] = arrayInput(N, sc);

        System.out.print("Enter the element to find in the array: ");
        int target = sc.nextInt();

        IndexRange(List, target);
        
        sc.close();
    }
}