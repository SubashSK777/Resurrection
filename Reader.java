
import java.io.*;


public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int num = Integer.parseInt(line);

        bw.write((num) * 2 + "\n");

        bw.flush();
    }
}
