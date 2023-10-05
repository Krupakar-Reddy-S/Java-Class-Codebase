import java.util.*;

class Every {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Num1 = sc.nextInt();
        long Sum = 0;

        while(Num <= Num1){
            Sum+=Num;
            Num++;
        }
        System.out.println(Sum);
        sc.close();
    } 
}
