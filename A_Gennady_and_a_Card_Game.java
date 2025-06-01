
import java.util.*;

public class A_Gennady_and_a_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String[] list = sc.nextLine().split(" ");
        int f = 0;
        for(String card : list ) {
            for (int i = 0; i < card.length(); i++) {
                if (card.charAt(i) == t.charAt(i)) {
                    f = 1;
                    break;
                }
            }
        }
        String res = (f == 1) ? "YES" : "NO";
        System.out.println(res);
    }
}