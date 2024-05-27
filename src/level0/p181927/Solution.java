package level0.p181927;

/**
 * Author : DDing77
 * Problem Name : 마지막 두 원소
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */

class Solution {

    public int[] solution(int[] num_list) {
        int lastValue = num_list[num_list.length - 1];
        int preValue = num_list[num_list.length - 2];

        int[] answer = new int[num_list.length + 1];
        if (lastValue > preValue) {
            answer[answer.length - 1] = lastValue - preValue;
        } else {
            answer[answer.length - 1] = lastValue * 2;
        }

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}