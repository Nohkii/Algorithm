import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 1;
        int num;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                index = i + 1;
            }
        }
        bw.write(max + "\n" + index);
        bw.flush();
        br.close();
        bw.close();
    }
}