package level2.p140107;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 점 찍기
 * Level : 2
 * Language : Java
 * Category : Math, Geometry
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/140107
 */

class Solution {

    public long solution(int k, int d) {

        long answer = 0;
        long distance = 0;
        long next = 0;
        for (int i = 0; i <= d; i += k) {
            next = (long) i * i;
            distance = (long) d * d;
            int top = (int) Math.sqrt(distance - next);
            answer += (top / k) + 1;
        }

        return answer;
    }
}