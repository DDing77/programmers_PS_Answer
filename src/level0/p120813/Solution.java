package level0.p120813;

import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name: 짝수는 싫어요
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */

class Solution {

    public int[] solution(int n) {

        return IntStream.range(1, n + 1).filter(i -> i%2 == 1).toArray();
    }
}
