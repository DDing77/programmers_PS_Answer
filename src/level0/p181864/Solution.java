package level0.p181864;

/**
 * Author : DDing77
 * Problem Name : 문자열 바꿔서 찾기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181864
 */

class Solution {

    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pat.length(); i++) {
            if (pat.charAt(i) == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        if (myString.contains(sb.toString())) {
            return 1;
        } else {
            return 0;
        }
    }
}