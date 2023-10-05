import java.util.*;

class FactorsBetweenTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        while(N <= M){
            System.out.println("The Factors of " + N + " are:");
            int i = 1;
            while(N >= i){
            if(N%i == 0){
                System.out.println(i);
            }
            i++;
            }
            N++;
        }
        sc.close();
    }  
}
