import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            numList.add(i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 1; i <= 30; i++) {
            for (int j = 0; j < 28; j++) {
                if (i == arrayList.get(j)) {
                    numList.remove(arrayList.get(j));
                }
            }
        }
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        for(int i : answer){
           bw.write(String.valueOf(i)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}