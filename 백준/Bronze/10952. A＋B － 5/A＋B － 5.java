import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num1;
        int num2;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0) break;
            sb.append(num1 + num2);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}