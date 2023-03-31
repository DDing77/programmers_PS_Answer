import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private int N, M;
    private PriorityQueue<Integer> positive, negative;
    private int max;
    private int res;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        positive = new PriorityQueue<>(Comparator.reverseOrder());
        negative = new PriorityQueue<>();

        max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            max = Math.max(max, Math.abs(cur));
            if (cur <= 0) {
                negative.add(cur);
            } else {
                positive.add(cur);
            }
        }

        res = 0;
        while (!negative.isEmpty()) {
            int peek = -negative.poll();
            int cnt = M - 1;
            while (cnt > 0 && !negative.isEmpty()) {
                cnt--;
                negative.poll();
            }
            res += peek * 2;
        }

        while (!positive.isEmpty()) {
            int peek = positive.poll();
            int cnt = M - 1;
            while (cnt > 0 && !positive.isEmpty()) {
                cnt--;
                positive.poll();
            }
            res += peek * 2;
        }

        res -= max;

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}