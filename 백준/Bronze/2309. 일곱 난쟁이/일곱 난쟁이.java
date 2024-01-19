import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        loof: for (int i = 0; i < array.length - 6; i++) {
            for (int j = i + 1; j < array.length - 5; j++) {
                for (int k = j + 1; k < array.length - 4; k++) {
                    for (int l = k + 1; l < array.length - 3; l++) {
                        for (int m = l + 1; m < array.length - 2; m++) {
                            for (int n = m + 1; n < array.length - 1; n++) {
                                for (int o = n + 1; o < array.length; o++) {
                                    if (array[i] + array[j] + array[k] + array[l] + array[m] + array[n] + array[o] == 100) {
                                        arrayList.add(array[i]);
                                        arrayList.add(array[j]);
                                        arrayList.add(array[k]);
                                        arrayList.add(array[l]);
                                        arrayList.add(array[m]);
                                        arrayList.add(array[n]);
                                        arrayList.add(array[o]);
                                        break loof;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length - 1) System.out.print(answer[i]);
            else System.out.println(answer[i]);
        }
    }
}