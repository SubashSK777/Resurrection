public class Recura {

    public static int recusive1 (int n){
        if (n == 0){
            return 1;
        } else {
            return recusive1(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        
    }
}