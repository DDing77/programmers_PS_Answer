package level0.p181878;

/**
 * Author : DDing77
 * Problem Name : 원하는 문자열 찾기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */

class Solution {

    public int solution(String myString, String pat) {
        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            return 1;
        }
        return 0;
    }
}