import java.util.*;

class SItriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print Inverted Triangle with spaces Pattern: ");
        int N = sc.nextInt();
        int i = N;

        while(i >= 0){
            int j = 0;
            System.out.print("*");
            while(j < i){
                System.out.print(" ");
                j++;
            }
            System.out.print("*");
            System.out.println();
            i--;
        }
        sc.close();
    }
}

