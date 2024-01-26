import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static boolean[] checked;
    static ArrayList<Integer>[] inputList;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int M = Integer.parseInt(strings[1]);
        int start = Integer.parseInt(strings[2]);

        checked = new boolean[N + 1];
        inputList = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            inputList[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            strings = br.readLine().split(" ");
            int V = Integer.parseInt(strings[0]);
            int E = Integer.parseInt(strings[1]);
            inputList[V].add(E);
            inputList[E].add(V);
        }
        for (int i = 1; i < N + 1; i++) {
            Collections.sort(inputList[i]);
        }

        dfs(start);
        System.out.println();

        checked = new boolean[N + 1];
        bfs(start);
    }

    public static void dfs(int s) {
        if (!checked[s]) {
            checked[s] = true;
            System.out.print(s + " ");
        }
        for (int i = 0; i < inputList[s].size(); i++) {
            if (checked[inputList[s].get(i)]) {
                continue;
            }
            dfs(inputList[s].get(i));
        }
    }

    public static void bfs(int s) {
        checked[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < inputList[node].size(); i++) {
                if (checked[inputList[node].get(i)]) continue;
                queue.add(inputList[node].get(i));
                checked[inputList[node].get(i)] = true;
            }
        }
    }
}