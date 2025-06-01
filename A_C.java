
import java.util.Scanner;

public class A_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int count = 0;
            while (a <= c && b <= c) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                count += 1;
            }
            System.out.println(count);
        }
    }
}