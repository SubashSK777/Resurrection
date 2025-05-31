
import java.util.Scanner;

public class A_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        int res = 0, max = 0;
        for (int i = 0; i < n; i++) {
            res -= sc.nextInt();
            // sc.nextLine();
            res += sc.nextInt();
            // sc.nextLine();
            if (res > max) max = res;
        }
        System.out.println(max);
    }
}