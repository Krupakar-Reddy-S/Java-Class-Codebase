import java.util.*;

class Similarly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print Similarly Pattern: ");
        int N = sc.nextInt();
        int i = 1;
        String Pattern = "";

        while(N >= i){
            if(i%2 != 0){
                Pattern+=((i/2)+1);
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

