package level0.p181884;

/**
 * Author : DDing77
 * Problem Name : n보다 커질 때까지 더하기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */

class Solution {

    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }

        return answer;
    }
}