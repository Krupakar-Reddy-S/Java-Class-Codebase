import java.util.*;

class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first side: ");
        int a = sc.nextInt();
        System.out.print("Enter the length of second line: ");
        int b = sc.nextInt();
        System.out.print("Enter the length of third line: ");
        int c = sc.nextInt();

        if ((a == b) && (b == c)){
            System.out.println("The given sides form an equilateral triangle.");
        }
        else if ((a == b) || (b == c) || (a == c)){
            System.out.println("The given sides form a isoceles triangle.");
        }
        else{
            System.out.println("The given sides form a scalene triangle.");
        }
        sc.close();
    }
}