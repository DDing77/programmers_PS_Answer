package level0.p181937;

/**
 * Author : DDing77
 * Problem Name : n의 배수
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */

class Solution {

    public int solution(int num, int n) {
        if (num % n == 0) {
            return 1;
        } else{
            return 0;
        }
    }
}