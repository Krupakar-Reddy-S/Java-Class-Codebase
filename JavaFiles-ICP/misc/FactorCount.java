import java.util.*;

class FactorCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int i = 1;

        while(N >= i){
            if(N%i == 0){
                count++;
            }
            i++;
        }
        System.out.println("The Number of Factors of " + N + " is: " + count);
        sc.close();  
    }
}
