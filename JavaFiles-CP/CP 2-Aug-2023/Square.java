import java.util.*;

class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N;

        while(N > 0){
            int i = n;
            while(i > 0){
                System.out.print("*");
                i--;
            }
            System.out.println();
            N--;
        }
        

        sc.close();
    }
    
}
