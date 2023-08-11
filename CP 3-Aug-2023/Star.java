import java.util.*;

class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Num1 = Num;
        int N = (4*Num)-1;
        int i = 0;

        while(i <= N){
            int j = N/2;
            int k = (j-i);
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            k = (j-i);
            int l = (N-(2*k));
            while(l > 0){
                System.out.print("*");
                l--;
            }
            k = (j-i);
            while(k > 0){
                System.out.print(" ");
                k--;
            }
            System.out.println();
            i++;
            if(i == 3){
                int o = 0;
                int m = N;
                while(Num1 > 0){
                    while(m > (o*2)){
                        System.out.print("*");
                        o+=2;
                    }
                }
            }
        sc.close();
        }
    }
}
