
import java.util.Scanner;

public class Recura {

    public static void count(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        count(i + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(1, n);
    }
}