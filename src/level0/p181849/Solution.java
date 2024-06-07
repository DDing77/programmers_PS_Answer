package level0.p181849;

/**
 * Author : DDing77
 * Problem Name : 문자열 정수의 합
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181849
 */

class Solution {
    public int solution(String num_str) {
        return num_str.chars().map(c -> c - '0').sum();
    }
}