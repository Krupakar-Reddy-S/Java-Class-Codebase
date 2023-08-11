import java.util.*;

class Sqroot{

    public static int squareRoot(int num){
        
        int i = 1;
        for(i = 1; i < num; i++){
            if((i*i) == num){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the Square root of a number");
        System.out.print("Enter the Number: ");
        int Num1 = sc.nextInt();

        System.out.println("The square root of " + Num1 + " = " + squareRoot(Num1));
        sc.close();
    }
}