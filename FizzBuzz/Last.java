import java.util.*;

class Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        String Nums = "" + Num;
        System.out.print(Nums.charAt(Nums.length()));
        sc.close();
    }
}
