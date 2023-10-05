import java.util.*;

public class Average {

    public static double average(int[] List){

        int sum = 0;
        for(int i = 0; i < List.length; i++){
            sum+=List[i];
        }

        return sum/(double) List.length;
    }

    public static int[] arrayInput(int Count){
        Scanner sc = new Scanner(System.in);
        int[] Marks =  new int[Count];
        int mark = 0;

        for(int i = 0; i < Count; i++){
            mark = sc.nextInt();
            Marks[i] = mark;
        }

        sc.close();
        return Marks;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of marks to input: ");
        int Count = sc.nextInt();
        int[] Marklist = arrayInput(Count);

        System.out.print("The list of marks entered is: ");
        System.out.println(Arrays.toString(Marklist));

        System.out.println("The average of the " + Count + " entered marks is: " + average(Marklist));

        sc.close();
    }
}
