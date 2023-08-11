import java.util.*;

class Astar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = N;

        while(i > 0){
            int j = i;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            int k = (2*N)-(2*(i));
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            j = i;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}