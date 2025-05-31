
import java.util.Scanner;

public class A_Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, min = 101, max_ind = 0, min_ind = 101;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > max) { max = x; max_ind = i; }
            if (x <= min) { min = x; min_ind = i; }
        }
        int res = (max_ind - 0) + ((n - 1) - min_ind) - (min_ind < max_ind ? 1 : 0);
        // System.out.println(max + " " + min + " " + max_ind + " " + min_ind);
        System.out.println(res);
    }
}