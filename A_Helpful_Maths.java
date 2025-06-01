
import java.util.*;


public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] d = s.split("\\+");
        Arrays.sort(d);
        System.out.println(String.join("+", d));

    }
}