import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num1;
        int num2;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            sb.append(num1 + num2).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}