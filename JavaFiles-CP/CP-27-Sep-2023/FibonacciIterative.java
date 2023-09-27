public class FibonacciIterative {

    public static int fibonacci(int N) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;

        for(int i = 2; i < N; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return f3;
    }

    public static void main(String[] args) {
        int N = 25;

        long start = System.currentTimeMillis();

        System.out.println("The " + N + "th Fibonacci Number is: " + fibonacci(N));

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

