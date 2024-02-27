package level1.p77484;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Author : DDing77
 * Problem Name: 로또의 최고 순위와 최저 순위
 * Level : 1
 * Language : Java
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */

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

    public Long solution(long n) {
        String answer = "";
        String input = String.valueOf(n);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            res.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
        Collections.sort(res, Comparator.reverseOrder());

        for (int now : res) {
            answer += String.valueOf(now);
        }
        return Long.parseLong(answer);
    }
}