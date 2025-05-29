
import java.util.Scanner;

class  A_Bit {
    public static void main(String[] args) {
        int A = 0;

        Scanner sc = new Scanner(System.in);
        int n =
        for (int i = 0; i < 2; i++) {
            String s = sc.nextLine();
            if (s.contains("++")) A++;
            else A--;
        }

        System.out.println(A);
    }
}