import java.util.*;

class Trailing0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the trailing 0's in its Factorial: ");
        int N = sc.nextInt();
        int Num = N;
        int Num1 = 0;

        while(Num > 0 ){
            Num1 = Num1 + Num/5;
            Num/=5;
        }
        System.out.println("No. of trailing 0's in the factorial of " + N + " is: " + Num1);
        sc.close();
    }
}
