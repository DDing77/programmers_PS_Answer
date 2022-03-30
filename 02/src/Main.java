import java.util.HashSet;

//programmersPS_02_로또의 최고 순위와 최저 순위

public class Main {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] rating = {6, 6, 5, 4, 3, 2, 1};

            HashSet<Integer> win = new HashSet<>();
            for (int winNumber : win_nums) win.add(winNumber);

            int cnt = 0;
            int zero = 0;
            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) zero++;
                else if (win.contains(lottos[i])) {
                    cnt++;
                }
            }

            int top = 0;
            int bottom = 6;

            if (cnt + zero <= 6) top = rating[cnt + zero];
            else top = 1;

            bottom = rating[cnt];

            int[] answer = {top, bottom};
            return answer;
        }
    }
}
