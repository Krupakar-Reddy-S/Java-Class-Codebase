import java.util.*;

class Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Nums = Num%100;
        int Nums1 = Num/10;
        if(((Nums1) + (Nums - Nums1)%10) %5 == 0){
            System.out.println("PLatinum");
        }
        else if(((Nums1) + (Nums - Nums1)%10) %3 == 0){
            System.out.println("Gold");
        }
        else if((((Num%1000) - ((Nums1) + (Nums - Nums1)%10))%10) %2 != 0){
            System.out.println("Diamond");
        }
        sc.close();
    }
}
