
import java.util.ArrayList;
import java.util.Scanner;

public class A_Sum_of_Round_Numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int i = 0; i < m; i ++) {
            ArrayList <Integer> res = new ArrayList<>();
            int n = sc.nextInt();

            int power = 1;

            while (n > 0) {
                if ((n % 10) > 0) {
                    res.add(0, (n % 10) * power);
                }
                n /= 10;
                power *= 10;
            }
            System.out.println(res.size());
            for (int j : res) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}