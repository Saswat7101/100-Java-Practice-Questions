// 32. Write a program to generate the Fibonacci series using recursion.

public class FibonacciSeriesRecursive {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
