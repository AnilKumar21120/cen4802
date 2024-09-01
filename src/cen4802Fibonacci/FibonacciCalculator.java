package cen4802Fibonacci;

/**
 * This class provides a method to calculate Fibonacci numbers.
 */
public class FibonacciCalculator {

    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n The position in the Fibonacci sequence (0-based index).
     * @return The Fibonacci number at the specified position.
     * @throws IllegalArgumentException if the provided index is negative.
     */
    public static int calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
