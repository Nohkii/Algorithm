import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = 0;
            bw.write("Case #" + i + ": ");
            st = new StringTokenizer(br.readLine(), " ");
            sum += Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(sum));
            if (i == num) break;
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}