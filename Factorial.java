import java.util.*;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the Factorial of a Number");
        System.out.print("Enter a Number: ");
        int  Num = sc.nextInt();

        if(Num > 0){
            long Factorial = 1;
            for(int i = 1; Num >= i; i++){
                Factorial*=i;
            }
            System.out.println("The Factorial of " + Num + " is: " + Factorial);
        }   
        else if(Num == 0){
            System.out.println("The Factorial of 0 is: 1");
        }
        else{
            Num*=-1;
            long Factorial = 1;
            for(int i = 1; Num >= i; i++){
                Factorial*=i;
            }
            if(Num%2 ==0){
                System.out.println("The Factorial of " + Num + " is: " + Factorial);
            }
            else{
                System.out.println("The Factorial of " + (Num*-1) + " is: " + Factorial*-1);
            }
        }
        sc.close();
    }
}
