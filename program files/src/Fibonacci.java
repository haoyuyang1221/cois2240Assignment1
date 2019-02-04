import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    /**
     * run fibonacci iteratively and generate the series number
     *
     * @param n user-defined number for fibonacci
     * @return fibonacci series number
     */
    public static long[] fiboSeriesRec(int n) {
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = calcFiboRecursively(i);
        }
        return result;
    }

    /**
     * calculate the nth fibonacci number recursively
     *
     * @param n user-defined number for fibonacci
     * @return the nth fibonacci number
     */
    private static long calcFiboRecursively(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calcFiboRecursively(n - 1) + calcFiboRecursively(n - 2);
    }

    /**
     * run fibonacci iteratively and generate the series number
     *
     * @param n user-defined number for fibonacci
     * @return fibonacci series number
     */
    public static long[] fiboSeriesIte(int n) {
        long[] result = new long[n];
        if (n >= 1) result[0] = 0;
        if (n >= 2) result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    /**
     * test function for fiboSeriesIte and fiboSeriesRec
     * and record the execution time
     *
     * @param n user-defined number for fibonacci
     */
    public static void testFibFuncAndRecordTime(int n) {
        long startTime = System.currentTimeMillis();
        System.out.println("----- n=" + n + " -----");
        System.out.print("Iteratively Fibonacci: ");
        System.out.println(Arrays.toString(fiboSeriesIte(n)));
        System.out.println("Execution Time: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        System.out.print("Recursively Fibonacci: ");
        System.out.println(Arrays.toString(fiboSeriesRec(n)));
        System.out.println("Execution Time: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    /**
     * main entrance of the program
     *
     * @param args arguments from user
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the n for fibonacci: ");
        int n = Integer.parseInt(sc.next());
        sc.close();
        testFibFuncAndRecordTime(n);

        // testFibFuncAndRecordTime(10);
        // testFibFuncAndRecordTime(20);
        // testFibFuncAndRecordTime(30);
        // testFibFuncAndRecordTime(40);
        // testFibFuncAndRecordTime(50);
    }
}