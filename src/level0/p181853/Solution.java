package level0.p181853;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 뒤에서 5등까지
 * Level : 0
 * Language : Java
 * Category : Sort
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181853
 */

class Solution {

    public int[] solution(int[] num_list) {
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}