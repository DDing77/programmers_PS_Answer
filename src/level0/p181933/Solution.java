package level0.p181933;

/**
 * Author : DDing77
 * Problem Name : flag에 따라 다른 값 반환하기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */

class Solution {

    public int solution(int a, int b, boolean flag) {
        if (flag) {
            return a + b;
        }
        return a - b;
    }
}