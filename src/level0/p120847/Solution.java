package level0.p120847;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 최댓값 만들기(1)
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */

public class Solution {

    public int solution(int[] numbers) {
        return Arrays.stream(numbers).boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(2)
                .mapToInt(Integer::intValue)
                .reduce((a, b) -> a * b)
                .orElseThrow();
    }
}
