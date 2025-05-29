
import java.util.Scanner;

public class A_Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int total_drinks = (b * l) / nl;
        int lime_slices = c * d;
        int salt = p / np;
        int min = Math.min(total_drinks, lime_slices);
        int mini = Math.min(min, salt);
        System.out.println(mini / n);
    }
}