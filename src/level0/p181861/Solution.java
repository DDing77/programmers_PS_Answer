package level0.p181861;

import java.util.ArrayList;

/**
 * Author : DDing77
 * Problem Name : 배열의 원소만큼 추가하기
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */

class Solution {

    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}