
import java.io.*;

public class Summer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] part = line.split(" ");

        int a = Integer.parseInt(part[0]);
        int b = Integer.parseInt(part[1]);

        bw.write(a + b);

        bw.flush();
    }
}
