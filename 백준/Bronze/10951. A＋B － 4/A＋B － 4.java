import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int num1 = 0;
        int num2 = 0;

        while((str = br.readLine())!=null){
            String[] strings = str.split(" ");
            num1= Integer.parseInt(strings[0]);
            num2= Integer.parseInt(strings[1]);
            System.out.println(num1+num2);
        }
        br.close();
    }
}