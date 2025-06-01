import java.util.*;

public class A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(res);
    }
}