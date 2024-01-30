import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String end = "";
        String str = "";
        while (true) {
            str = br.readLine();
            if(str.equals("0")) break;
            end = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                end += str.substring(i, i + 1);
            }
            if (str.equals(end)) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}