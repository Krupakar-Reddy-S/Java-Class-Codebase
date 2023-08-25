import java.util.*;

class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print Triangle Pattern: ");

        int N = sc.nextInt();
        int i = 1;

        while(N >= i){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
    
}