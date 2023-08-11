import java.util.*;

class Diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;

        while(i < N){
            int j = i;
            int k = ((2*N)-(2*(i))/2);
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            j = i;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            j = i;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            k = ((2*N)-(2*(i))/2);
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            System.out.println();
            i++;
        }

        i = (N-1);
        while(i > 0){
            int j = i;
            int k = ((2*N)-(2*(i))/2);
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            j = i;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            j = i;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            k = ((2*N)-(2*(i))/2);
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            System.out.println();
            i--;
        }

        sc.close();
    }
}
