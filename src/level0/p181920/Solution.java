package level0.p181920;

/**
 * Author : DDing77
 * Problem Name : 카운트 업
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */

class Solution {

    public int[] solution(int start_num, int end_num) {
        int[] result = new int[end_num - start_num + 1];
        for (int i = start_num; i <= end_num; i++) {
            result[i - start_num] = i;
        }
        return result;
    }
}