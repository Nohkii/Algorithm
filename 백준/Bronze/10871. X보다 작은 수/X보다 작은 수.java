import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] array = new int[Integer.parseInt(st.nextToken())];
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < array.length; i ++){
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i] < num) {
                bw.write(String.valueOf(array[i]+" "));
            }
        }
        bw.flush();
        bw.close();
    }
}