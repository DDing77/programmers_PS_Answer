package level1.p147355;

/**
 * Author : DDing77
 * Problem Name: 크기가 작은 부분 문자열
 * Level : 1
 * Language : Java
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

class Solution {

    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length(); i++) {
            if (i + p.length() > t.length()) break;
            String sub = t.substring(i, i + p.length());
            if (sub.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}