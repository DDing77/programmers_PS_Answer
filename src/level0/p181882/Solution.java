package level0.p181882;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 조건에 맞게 수열 변환하기 1
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181882
 */

class Solution {

    public int[] solution(int[] arr) {

        return Arrays.stream(arr).map(i -> {
                    if (i >= 50 && i % 2 == 0) {
                        return i / 2;
                    } else if (i < 50 && i % 2 == 1) {
                        return i * 2;
                    } else {
                        return i;
                    }
                })
                .toArray();
    }
}