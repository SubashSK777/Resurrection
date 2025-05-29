
import java.util.Scanner;

public class A_The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int mini = Math.min(x, Math.min(y, z));
        int maxi = Math.max(x, Math.max(y, z));
        int avg = (mini + maxi) / 2;

        int dist = Math.abs(mini - avg) + Math.abs(maxi - avg);
        System.out.println(dist);
    }
}