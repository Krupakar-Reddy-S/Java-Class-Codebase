import java.util.*;

class Similar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print Similar Pattern: ");
        int N = sc.nextInt();
        int i = 1;
        String Pattern = "";

        while(N >= i){
            if(i%2 == 0){
                Pattern+=i;
            }
            else{
                Pattern+="*";
            }
            System.out.println(Pattern);
            i++;
        }
        sc.close();
    }
    
}
