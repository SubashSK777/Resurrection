
import java.util.Scanner;

public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int res = 0;
         int k = sc.nextInt();
         int n = sc.nextInt();
         int w = sc.nextInt();

         for (int i = 1; i <= w; i++) {
            res += i * k;
        }
        int cost = (res < n) ? 0 : (res - n);
        System.out.println(cost);
    }
}