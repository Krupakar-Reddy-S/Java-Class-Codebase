import java.util.*;

class OpFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        System.out.println("The Factors of " + N + " are:");

        while(i <= (N/i)){
                if(N%i == 0){
                    System.out.println(i);
                    System.out.println(N/i);
                    i=(N/i);
                    break;
                }
        }
        sc.close(); 
    } 
}


