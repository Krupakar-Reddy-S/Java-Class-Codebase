import java.util.*;

class Product{

    public static int product(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the Product of Two Numbers");
        System.out.print("Enter the First Number: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int Num2 = sc.nextInt();

        System.out.println("The product of " + Num1 + " X " + Num2 + " = " + product(Num1, Num2));
        sc.close();
    }
}
