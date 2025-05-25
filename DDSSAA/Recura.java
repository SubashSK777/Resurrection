
import java.util.Scanner;

public class Recura {

    public static int count(int i, int n) {
        if (i > n) return;
        System.out.println(i + " ");
        return count(i + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(1, n));
    }
}