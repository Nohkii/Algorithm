import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = br.readLine().split(" ");
        StringTokenizer st;
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[n][m];

        int[][] answer = new int[n][m];

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < m; j++) {
                    answer[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}