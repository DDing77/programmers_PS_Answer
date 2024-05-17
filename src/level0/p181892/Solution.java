package level0.p181892;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : n 번째 원소부터
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181892
 */

class Solution {

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}