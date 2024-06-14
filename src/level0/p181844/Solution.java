package level0.p181844;

import java.util.LinkedList;
import java.util.List;

/**
 * Author : DDing77
 * Problem Name : 배열의 원소 삭제하기
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181844
 */

class Solution {

    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new LinkedList<>();
        for (int i : arr) {
            boolean isContain = false;
            for (int j : delete_list) {
                if (i == j) {
                    isContain = true;
                    break;
                }
            }

            if (!isContain) {
                answerList.add(i);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}