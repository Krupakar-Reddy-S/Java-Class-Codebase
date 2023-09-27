public class SumOfNaturals {

    /* 
     * Given a number N, return the sum of first N natural numbers.
    */

    public static int sumNaturals(int N) {
        if( N == 1) {
            return 1;
        }
        return sumNaturals(N -1) + N;
    }

    public static void main(String[] args) {
        int N = 10;

        System.out.println("Sum of first " + N + " natural numbers is: " + sumNaturals(N));
    }
}
