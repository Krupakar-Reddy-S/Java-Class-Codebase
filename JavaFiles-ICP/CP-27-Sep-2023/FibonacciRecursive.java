public class FibonacciRecursive {

    public static int fibonacci(int N) {
        if(N == 1) {
            return 1;
        }

        if(N == 0) {
            return 0;
        }

        return fibonacci(N -1) + fibonacci(N -2);
    }

    public static void main(String[] args) {
        int N = 25;

        long start = System.currentTimeMillis();

        System.out.println("The " + N + "th Fibonacci Number is: " + fibonacci(N));

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
