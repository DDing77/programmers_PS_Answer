package level1.p17682;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name : [1차] 다트 게임
 * Level : 1
 * Language : Java
 * Category : Implement, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/17682
 */

class Solution {

    Map<Character, Integer> powTable;
    ArrayList<Integer> score;

    public int solution(String dartResult) {

        powTable = new HashMap<>();
        powTable.put('S', 1);
        powTable.put('D', 2);
        powTable.put('T', 3);

        score = new ArrayList<>();

        int answer = 0;
        int idx = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dartResult.length(); i++) {
            char cur = dartResult.charAt(i);

            if (Character.isDigit(cur)) {
                sb.append(cur);
            } else if (powTable.containsKey(cur)) {
                score.add((int) Math.pow(Integer.parseInt(sb.toString()), powTable.get(cur)));
                sb.setLength(0);
            } else if (cur == '*') {
                if (score.size() == 1) {
                    score.set(0, score.get(0) * 2);
                } else {
                    score.set(score.size() - 2, score.get(score.size() - 2) * 2);
                    score.set(score.size() - 1, score.get(score.size() - 1) * 2);
                }
            } else {
                score.set(score.size() - 1, score.get(score.size() - 1) * (- 1));
            }
        }

        for (Integer integer : score) {
            answer += integer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new String("1S2D*3T")));
    }
}