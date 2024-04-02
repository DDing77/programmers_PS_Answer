package level2.p131127;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 할인 행사
 * Level : 2
 * Language : Java
 * Category : Hash, PrefixSum
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/131127
 */

class Solution {

    public int solution(String[] want, int[] number, String[] discount) {

        int answer = 0;
        int length = discount.length;
        int[][] prefixSum = new int[length + 1][want.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], i);
        }

        for (int i = length - 1; i >= 0; i--) {

            for (int j = 0; j < prefixSum[i].length; j++) {
                prefixSum[i][j] = prefixSum[i + 1][j];
            }

            if (map.containsKey(discount[i])) {
                prefixSum[i][map.get(discount[i])]++;
            }
        }

        for (int i = 0; i <= length - 10; i++) {
            boolean check = true;
            for (int j = 0; j < prefixSum[i].length; j++) {
                if (prefixSum[i][j] - prefixSum[i + 10][j] < number[j]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                answer++;
            }
        }
        return answer;
    }
}
