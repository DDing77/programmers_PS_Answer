package level0.p181935;

/**
 * Author : DDing77
 * Problem Name : 홀짝에 따라 다른 값 반환하기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

class Solution {

    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }
        return answer;
    }
}