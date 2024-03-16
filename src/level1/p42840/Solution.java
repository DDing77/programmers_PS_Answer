package level1.p42840;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 모의고사
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */

class Solution {

    static String[] pattern = {"12345", "21232425", "3311224455"};

    private int gertScore(int[] answers, String pattern) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == (pattern.charAt(i % pattern.length()) - '0')) {
                score++;
            }
        }
        return score;
    }

    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < 3; i++) {
            int score = gertScore(answers, pattern[i]);
            if (answer.isEmpty()) {
                answer.add(i + 1);
                max = score;
            } else if (max == score) {
                answer.add(i + 1);
            } else if (max < score) {
                max = score;
                answer.clear();
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(new int[]{1,3,2,4,2})));
    }
}