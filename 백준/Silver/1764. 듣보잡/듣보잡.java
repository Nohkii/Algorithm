import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        String str = "";
        for (int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        String[] strings = new String[arrayList.size()];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = arrayList.get(i);
        }
        Arrays.sort(strings);
        bw.write(strings.length + "\n");
        for (String s : strings) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}