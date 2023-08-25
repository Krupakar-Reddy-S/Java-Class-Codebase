import java.util.*;
class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if Even/Odd: ");
        int num = sc.nextInt();
        if ((num%2) == 0){
            System.out.println("The given number " + num + " is Even.");
        }
        else{
            System.out.println("The given number " + num + " is Odd.");
        }
        sc.close();
    }
}
