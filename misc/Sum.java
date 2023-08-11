import java.util.*;

class Template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Num1 = Num;
        int Sum = 0;

        while(Num1 > Num){
            Sum+= (Num%10);
            Num/=10;
        }
        System.out.print(Sum);
        sc.close();
    }
}