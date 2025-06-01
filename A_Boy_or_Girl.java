
import java.util.*;

public class A_Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        String s = sc.nextLine();
        for (char c : s.toCharArray()) set.add(c);
        String res = (set.size() % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!";
        System.out.println(res);
    }
}