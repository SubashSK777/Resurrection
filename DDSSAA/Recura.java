

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

    public static void main(String[] args) {
        // count(1, 10);
        // rev_count(10);
        System.out.print(sum_n(10));
    }
}