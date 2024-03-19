package level0.p120836;

import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name: 순서쌍의 개수
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */

class Solution {

    public int solution(int n) {

        return (int) IntStream.range(1, n + 1).filter(i -> n % i == 0).count();
    }
}