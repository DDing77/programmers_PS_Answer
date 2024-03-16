package level1.p176963;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name: 추억 점수
 * Level : 1
 * Language : Java
 * Category : Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */

class Solution {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (score.containsKey(photo[i][j])) {
                    sum += score.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}