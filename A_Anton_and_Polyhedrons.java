
import java.util.Scanner;

public class A_Anton_and_Polyhedrons {
    public static void main(String[] args) {
        int r = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.charAt(0) == 'T') r += 4;
            else if (s.charAt(0) == 'C') r += 6;
            else if (s.charAt(0) == 'O') r += 8;
            else if (s.charAt(0) == 'D') r += 12;
            else if (s.charAt(0) == 'I') r += 20;
            
        } System.out.println(r);
    }
}