package level0.p120845;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 주사위의 개수
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120845
 */

class Solution {

    public int solution(int[] box, int n) {

        return Arrays.stream(box)
                .map(value -> value / n)
                .reduce(1, (left, right) -> left * right);
    }
}