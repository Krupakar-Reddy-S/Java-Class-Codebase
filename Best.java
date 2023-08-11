public class Best {
    public static String solve(String A) {
        int Ternary = Integer.parseInt(A);
        int Decimal = 0;
        for(int i = 0; Ternary > 0; i++){
            Decimal += (Ternary%10)*(int) Math.pow(3,i);
            Ternary/=10;
        }

        Decimal*=10;
        String Result = "";
        for(int i = 1; Decimal > 0; i++){
            Result = Integer.toString((Decimal%3)) + Result;
            Decimal/=3;
        }
        return Result;
    }

    public static void main(String args[]){
        //solve("12");
        System.out.println(solve("12"));
    }
}
