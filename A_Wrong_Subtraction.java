
import java.util.Scanner;

public class A_Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), step = sc.nextInt();

        while (step-- > 0) {
            if (n % 10 != 0) n -= 1;
            else n /= 10;    
        }
        System.out.println(n);
    }
}