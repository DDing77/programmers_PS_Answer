package level0.p120817;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 배열의 평균값
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */

class Solution {

    public double solution(int[] numbers) {

        return Arrays.stream(numbers).sum() / (double) numbers.length;
    }
}