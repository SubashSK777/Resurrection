
import java.util.Scanner;

public class A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int f = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) { f = 1; }
        } 
        System.out.println(f == 1 ? "HARD" : "EASY");
    }
}