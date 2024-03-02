package level1.p12941;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 최솟값 만들기
 * Level : 1
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12941
 */

class Solution {

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}
