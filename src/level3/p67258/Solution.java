package level3.p67258;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name: 보석 쇼핑
 * Level : 3
 * Language : Java
 * Category : Sliding-Window
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/67258
 */

class Solution {

    public int[] solution(String[] gems) {

        Map<String, Integer> set = new HashMap();

        for (String gem : gems) {
            set.put(gem, set.getOrDefault(gem, 0) + 1);
        }


        int totalGemType = set.size();

        int left = 0;
        int right = 0;
        int minDistance = Integer.MAX_VALUE;
        int minDistanceLeft = 0;
        int maxDistanceRight = gems.length;
        HashMap<String, Integer> temp = new HashMap<>();

        while (left < gems.length) {
            if (temp.size() == totalGemType) {
                if (minDistance > right - left) {
                    minDistance = right - left;
                    minDistanceLeft = left;
                    maxDistanceRight = right;
                }

                if (temp.get(gems[left]) > 1) {
                    temp.put(gems[left], temp.get(gems[left]) - 1);
                } else {
                    temp.remove(gems[left]);
                }
                left++;
            } else {
                if (right >= gems.length) {
                    break;
                }
                temp.put(gems[right], temp.getOrDefault(gems[right], 0) + 1);
                right++;
            }
        }


        int[] answer = new int[2];
        answer[0] = minDistanceLeft + 1;
        answer[1] = maxDistanceRight;

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(new String[]{"DIA", "EM", "EM", "RUB", "DIA"})));
    }
}
