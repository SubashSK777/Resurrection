import java.util.Scanner;

public class A_Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] p = new int[n + 1];
        int[] inv = new int[n + 1];
        for ( int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            p[i] = x;
        }
        for ( int  i = 1; i <= n; i++) {
            int rec = p[i];
            inv[rec] = i;
        }
        for (int i = 1; i <= n; i++){
            System.out.print(inv[i] + " ");
        }
    }
}