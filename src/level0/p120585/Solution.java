package level0.p120585;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 머쓱이보다 키 큰 사람
 * Level : 0
 * Language : Java
 * Category : Binary Search
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */

public class Solution {

    public int solution(int[] array, int height) {

        Arrays.sort(array);

        int left = 0;
        int right = array.length;
        int mid;

        while (left < right) {
            mid = (left + right) >> 1;

            if (array[mid] > height) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return array.length - right;
    }
}
