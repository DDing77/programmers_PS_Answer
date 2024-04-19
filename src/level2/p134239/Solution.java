package level2.p134239;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 우박수열 정적분
 * Level : 2
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/134239
 */

class Solution {

    public double[] solution(int k, int[][] ranges) {
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(k);
        while (k > 1) {
            if (k % 2 == 1) {
                k = 3 * k + 1;
            } else {
                k /= 2;
            }
            temp.add(k);
        }

        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int left = ranges[i][0];
            int right = temp.size() - 1 + ranges[i][1];

            if (left > right) {
                answer[i] = -1;
                continue;
            }

            double sum = 0.0;
            for (int j = left; j < right; j++) {
                sum += ((double)temp.get(j) + temp.get(j + 1)) / 2;
            }
            answer[i] = sum;
        }
        return answer;
    }
}