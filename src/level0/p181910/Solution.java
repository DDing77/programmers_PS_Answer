package level0.p181910;

/**
 * Author : DDing77
 * Problem Name : 문자열의 뒤의 n글자
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */

class Solution {

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}