import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append("*");
            }
            if (i == num) break;
            sb.append(System.lineSeparator());
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}