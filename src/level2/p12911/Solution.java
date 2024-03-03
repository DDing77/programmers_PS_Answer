package level2.p12911;

/**
 * Author : DDing77
 * Problem Name: 다음 큰 숫자
 * Level : 2
 * Language : Java
 * Category : Bit
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12911
 */

class Solution {

    public int solution(int n) {

        int originCnt = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == originCnt) {
                break;
            }
        }

        return n;
    }
}