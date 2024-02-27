package level0.p120851;

/**
 * Author : DDing77
 * Problem Name: 숨어있는 숫자의 덧셈 (1)
 * Level : 0
 * Language : Java
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */

class Solution {

    public int solution(String my_string) {

        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if ('1' <= ch && ch <= '9') {
                answer += ch - '0';
            }
        }
        return answer;
    }
}