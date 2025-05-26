

public class Recura {

    public static void count(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        count(i + 1, n);
    }

    public static void rev_count(int i) {
        if (i == 0) return;
        System.out.print(i + " ");
        rev_count(i - 1);
    }

    public static int sum_n(int n) {
        if (n == 0) return 0;
        return n + sum_n(n - 1);
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        return factorial(n - 1) * n;
    }

    public static int fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacci_seq(int n){
        if (n <= 1) return n;
        return fibonacci_seq(n - 1) + fibonacci_seq(n - 2);
    } 

    public static void main(String[] args) {
        // count(1, 10);
        // rev_count(10);
        // System.out.print(sum_n(10));
        // System.out.println(factorial(10));
        // System.out.println(fibonacci(10));
        // fibonacci_seq(10);
        // for (int i = 0; i <= 10; i ++) {
        //     System.out.print(fibonacci_seq(i) + " ");
        // }

        
    }
}