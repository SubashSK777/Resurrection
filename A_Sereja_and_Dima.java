import java.util.*;

public class A_Sereja_and_Dima{
    public static void main(String[] args){
       int  sereja = 0;
        int dima = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n - 1;

        int c = 0;

        while (i <= j){
            if (arr[i] <= arr[j]) {
                if (iseven(c)) {
                    sereja += arr[j];
                    j--;
                    c++;
                } else {
                    dima += arr[j];
                    j--;
                    c++;
                }
            } else {
                if (iseven(c)) {
                    sereja += arr[i];
                    i++;
                    c++;
                } else {
                    dima += arr[i];
                    i++;
                    c++;
                }
            }
        }

        System.out.print(sereja + " " + dima);


    }
    public static boolean iseven(int c) {
        return c % 2 == 0;
    }
}