public class SumOfDigits {

    /* 
     * Given a number N, return the sum of digits of N.
    */

    public static int sumOfDigits(int N) {
        if(N == 0) {
            return 0;
        }
        
        int digit = N%10;
        return sumOfDigits(N/10) + digit;
    }

    public static void main(String[] args) {
       int N = 123456789;
       
       System.out.println("Sum of Digits of Given Number is: "  + sumOfDigits(N));
    }
}
