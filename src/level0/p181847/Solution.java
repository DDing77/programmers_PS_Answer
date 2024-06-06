package level0.p181847;

/**
 * Author : DDing77
 * Problem Name : 0 떼기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181847
 */

class Solution {

    public String solution(String n_str) {
        int idx = 0;
        while (n_str.charAt(idx) == '0') {
            idx++;
        }
        return n_str.substring(idx);
    }
}