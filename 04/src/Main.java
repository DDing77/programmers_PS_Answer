import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int getDistance(String s) {
        int res = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            String left = s.substring(0, i);
            String right = "";
            StringBuilder sb = new StringBuilder();
            int cnt = 1;

            for (int start = i; start <= s.length(); start += i) {
                if (start + i >= s.length()) right = s.substring(start, s.length());
                else right = s.substring(start, start + i);

                if( right.equals(left)) cnt++;
                else if( cnt == 1) {
                    sb.append(left);
                    left = right;
                } else {
                    sb.append(cnt).append(left);
                    left = right;
                    cnt = 1;
                }
            }
            if( i != left.length()) sb.append(left);
            res = Math.min(res, sb.length());
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int res = getDistance(input);

        System.out.println(res);
    }
}
