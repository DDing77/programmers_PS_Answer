package level0.p181940;

/**
 * Author : DDing77
 * Problem Name : 문자열 곱하기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */

class Solution {

    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        while (k-- > 0) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}