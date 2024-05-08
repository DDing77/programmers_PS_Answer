package level2.p181188;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 요격 시스템
 * Level : 2
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181188
 */

class Solution {

    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));

        int preRight = 0;
        int answer = 0;
        for (int i = 0; i < targets.length; i++) {
            if (preRight <= targets[i][0]) {
                answer++;
                preRight = targets[i][1];
            }
        }

        return answer;
    }
}
