import java.util.*;

class Sum{

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the Sum of Two Numbers");
        System.out.print("Enter the First Number: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int Num2 = sc.nextInt();

        System.out.println("The sum of " + Num1 + " + " + Num2 + " = " + sum(Num1, Num2));
        sc.close();
    }
}
