package level0.p181908;

/**
 * Author : DDing77
 * Problem Name : 접미사인지 확인하기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181908
 */

class Solution {

    public int solution(String my_string, String is_suffix) {
        if (is_suffix.length() > my_string.length()) {
            return 0;
        }
        if (my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}