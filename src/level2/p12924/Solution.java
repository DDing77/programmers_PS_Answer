package level2.p12924;

import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name: 숫자의 표현
 * Level : 2
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */

public class Solution {

    public long solution(int n) {
        return IntStream.range(1, n + 1)
                .filter(i -> i % 2 == 1 && n % i == 0)
                .count();
    }
}
