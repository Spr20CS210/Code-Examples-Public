package midterm4;

import java.util.HashMap;

public class Memoization {

    private static int numCalls = 0;

    private static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        System.out.println(fib(25));
        System.out.println(numCalls);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21...
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Cannot pass in negative values");
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        numCalls++;
        System.out.println("Called fib with n = " + n);
        if (n == 0 || n == 1) {
            memo.put(n, n);
            return n;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            memo.put(n, result);
            return result;
        }

    }

}
