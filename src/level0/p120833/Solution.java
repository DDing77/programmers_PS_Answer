package level0.p120833;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 배열 자르기
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */

public class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {

        return Arrays.stream(numbers, num1, num2 + 1).toArray();
    }
}
