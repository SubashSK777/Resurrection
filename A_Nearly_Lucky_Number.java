
import java.util.Scanner;

public class A_Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7'){
                f += 1;
            } 
        }System.out.println(f == 4 || f == 7  ? "YES" : "NO");
    }
}