package level0.p181879;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 길이에 따른 연산
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */

class Solution {

    public int solution(int[] num_list) {

        if (num_list.length >= 11) {
            return Arrays.stream(num_list).sum();
        } else {
            return Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
        }
    }
}