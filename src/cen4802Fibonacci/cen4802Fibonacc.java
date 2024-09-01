

package cen4802Fibonacci;

/**
 * This class provides a method to calculate Fibonacci numbers.
 */
public class cen4802Fibonacc {

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Main method to test the fibonacci method
    public static void main(String[] args) {
        int n = 10;  // We want to find the 10th term in the Fibonacci sequence
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
