package level3.p42884;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author : DDing77
 * Problem Name: 단속카메라
 * Level : 3
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42884
 */

class Solution {

    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));

        AtomicInteger pre = new AtomicInteger(routes[0][1]);

        int answer = (int) Arrays.stream(routes, 1, routes.length)
                .filter(route -> pre.get() < route[0])
                .peek(route -> pre.set(route[1]))
                .count();

        return answer + 1;
    }
}
