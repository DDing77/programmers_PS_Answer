package level3.p12987;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name: 숫자 게임
 * Level : 3
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12987
 */

class Solution {

    public int solution(int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int idxA = 0;
        int idxB = 0;
        int length = A.length;

        int answer = 0;
        while(idxB < length) {
            if(B[idxB]> A[idxA]) {
                idxB++;
                idxA++;
                answer++;
            } else {
                idxB++;
            }
        }

        return answer;
    }
}