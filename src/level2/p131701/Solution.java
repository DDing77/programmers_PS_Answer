package level2.p131701;

import java.util.HashSet;
import java.util.Set;

/**
 * Author : DDing77
 * Problem Name : 연속 부분 수열 합의 개수
 * Level : 2
 * Language : Java
 * Category : DP, Window-Sliding
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/131701#qna
 */

class Solution {

    public int solution(int[] elements) {

        Set<Integer> res = new HashSet<>();

        int length = elements.length;
        for (int i = 1; i <= length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += elements[j];
            }

            res.add(sum);

            for (int j = 0; j < length; j++) {
                sum -= elements[j];
                sum += elements[(j + i) % length];
                res.add(sum);
            }
        }

        return res.size();
    }
}
