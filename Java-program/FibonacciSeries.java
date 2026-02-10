public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 30;
        long a = 0, b = 1;

        System.out.println("Fibonacci Series (30 terms):");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
