import java.util.*;

class All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Num10 = 10;

        while(Num >= Num10){
            System.out.println(Num%Num10);
            Num10*= 10;
        }
        sc.close();
    }
}
