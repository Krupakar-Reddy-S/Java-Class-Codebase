import java.util.*;

class Everye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Num1 = sc.nextInt();
        long Sum = 0;

        if(Num%2 != 0){
            Num+=1;
        }

        while(Num <= Num1){
            Sum+=Num;
            Num+=2;
        }
        
        System.out.println(Sum);
        sc.close();
    } 
}