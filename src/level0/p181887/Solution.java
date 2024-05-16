package level0.p181887;

/**
 * Author : DDing77
 * Problem Name : 홀수 vs 짝수
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */

class Solution {

    public int solution(int[] num_list) {
        int oddIdxEleSum = 0;
        int evenIdxEleSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddIdxEleSum += num_list[i];
            } else {
                evenIdxEleSum += num_list[i];
            }
        }
        return Math.max(oddIdxEleSum, evenIdxEleSum);
    }
}