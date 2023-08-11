import java.util.*;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int Breadth = sc.nextInt();

        while(Length > 0){
            int breadth = Breadth;
            while(breadth > 0){
                System.out.print("*");
                breadth--;
            }
            System.out.println();
            Length--;
        }
        sc.close();
    }
    
}
