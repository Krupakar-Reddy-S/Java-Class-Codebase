import java.util.*;

class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to factorize: ");
        int Num = sc.nextInt();
        System.out.println("The Prime factorization of " + Num + " is: ");
        int N = Num;
        int i = 2;
        
        while(Num >= (i*i)){
            while(N%i == 0){
                System.out.println(i);
                N/=i;
            }
            i++;
        }
        if(N >= i){
        System.out.println(N);
        }
        sc.close();
    }  
}