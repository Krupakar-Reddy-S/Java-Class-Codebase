import java.util.*;

class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if(N%2 != 0){
            N+=1;}

        while(N <= M){
            System.out.println(N);
            N+=2;
        }
        sc.close();
    }
}
