
import java.util.Scanner;

public class A_ChewbacCa_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            int d = s.charAt(i) - '0';
            int comp = 9 - d;

            if (i == 0 && d == 0) sb.append(d);
            else sb.append(Math.min(comp, d));
        }
        System.out.println(sb);

    }
}