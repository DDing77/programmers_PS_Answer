package level1.p68935;

/**
 * Author : DDing77
 * Problem Name: 3진법 뒤집기
 * Level : 1
 * Language : Java
 * Category : Math, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */

public class Solution {

    public int solution(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toString(n, 3)).reverse().toString(), 3);
    }
}
