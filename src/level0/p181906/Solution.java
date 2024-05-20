package level0.p181906;

/**
 * Author : DDing77
 * Problem Name : 접두사인지 확인하기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181906
 */

class Solution {

    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        }
        return 0;
    }
}