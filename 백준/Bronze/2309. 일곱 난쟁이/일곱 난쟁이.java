import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 9명에서 2명의 난쟁이를 뺀 수가 100일 때 찾기
        int sum = 0;
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }
        int num1 = 0;
        int num2 = 0;

        loof:
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sum - array[i] - array[j] == 100) {
                    num1 = array[i];
                    num2 = array[j];
                    break loof;
                }
            }
        }
        Arrays.sort(array);
        for(int i : array){
            if(i == num1 || i == num2){
                continue;
            }
            System.out.println(i);
        }
    }
}