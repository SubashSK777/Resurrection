
import java.util.Scanner;

public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        int col = 0, row = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    col = i;
                    row = j;
                }
            }
        }
        System.out.println((Math.abs(col - 2) + Math.abs(row - 2)));
    }
}