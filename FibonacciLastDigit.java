import java.util.*;

public class FibonacciLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double c = getFibonacciLastDigit(n);
        System.out.printf("%.0f\n", c);
    }

    private static double getFibonacciLastDigit(int n) {
        n = n % 60;

        if (n <= 1) {
            return n;
        }

        double previous = 0;
        double current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            double tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
}