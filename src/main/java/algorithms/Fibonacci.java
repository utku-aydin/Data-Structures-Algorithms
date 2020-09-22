package algorithms;

public class Fibonacci {

    public int getFibOf(int n, int[] mem) {
        return recursiveSol(n, mem);
    }

    // Call stack max is the longest recursion -> fib n to 1, so O(N)
    private int recursiveSol(int n, int[] mem) {
        // <= to avoid infinite recursion (StackOverFlow)
        if (n <= 0)
            return 0;
        else if (n == 1) {
            return 1;
        } else if (mem[n] == 0) {
            mem[n] = recursiveSol(n - 1, mem) + recursiveSol(n - 2, mem);
        }

        return mem[n];
    }

}
