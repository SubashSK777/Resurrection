
import java.util.Scanner;

class  A_Bit {
    public static void main(String[] args) {
        int A = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.contains("++")) A++;
            else A--;
        }

        System.out.println(A);
    }
}