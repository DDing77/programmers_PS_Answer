package level0.p181899;

/**
 * Author : DDing77
 * Problem Name : 카운트 다운
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181899
 */

class Solution {

    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start--;
        }
        return answer;
    }
}