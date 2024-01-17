import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i; k++) {
                bw.write("*");
            }
            if (i == num) break;
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}