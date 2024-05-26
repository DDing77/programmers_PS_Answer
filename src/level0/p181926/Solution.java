package level0.p181926;

/**
 * Author : DDing77
 * Problem Name : 수 조작하기 1
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */

class Solution {

    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char ch = control.charAt(i);
            if (ch == 'w') {
                n++;
            } else if (ch == 's') {
                n--;
            } else if (ch == 'd') {
                n += 10;
            } else if (ch == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}