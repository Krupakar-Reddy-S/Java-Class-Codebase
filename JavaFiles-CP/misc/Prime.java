import java.util.*;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int i = 1;

        while(N >= i){
            if(N%i == 0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        if(count == 2){
            System.out.println(N + " is a Prime Number");
        }
        else{
            System.out.println(N + " is not a Prime Number");
        }
        sc.close();  
    }
}
