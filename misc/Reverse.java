import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Last = 0;
        int Rev = 0;

        while(Num > 0){
            Last = Num%10;
            Rev = (Rev*10) + Last;
            Num/=10;
        }
        System.out.println(Rev);
        sc.close();
    }
}