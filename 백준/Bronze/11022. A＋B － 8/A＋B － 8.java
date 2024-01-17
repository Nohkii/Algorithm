import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
            if (i == num) break;
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}