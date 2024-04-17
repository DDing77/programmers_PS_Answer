package level2.p17687;

/**
 * Author : DDing77
 * Problem Name : [3차] n진수 게임
 * Level : 2
 * Language : Java
 * Category : Math, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/17687
 */

class Solution {

    public String solution(int n, int t, int m, int p) {

        StringBuilder sb = new StringBuilder();
        int cur = 0;
        while (t * m > sb.length()) {
            sb.append(Integer.toString(cur++, n));
        }

        StringBuilder answer = new StringBuilder();
        int idx = p;
        int count = 0;
        while (count < t) {
            answer.append(sb.charAt(idx - 1));
            idx += m;
            count++;
        }

        return answer.toString().toUpperCase();
    }
}