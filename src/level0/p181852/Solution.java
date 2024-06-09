package level0.p181852;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 뒤에서 5등 위로
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181852
 */

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        int length = num_list.length - 5;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i + 5];
        }
        return answer;
    }
}