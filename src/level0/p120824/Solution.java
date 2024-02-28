package level0.p120824;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 짝수 홀수 개수
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */

public class Solution {

    public int[] solution(int[] num_list) {

        int evenCnt = (int) Arrays.stream(num_list).filter(num -> num % 2 == 0).count();
        int oddCnt = num_list.length - evenCnt;

        return new int[]{evenCnt, oddCnt};
    }
}
