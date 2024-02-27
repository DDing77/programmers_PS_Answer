package level0.p120892;

/**
 * Author : DDing77
 * Problem Name: 암호 해독
 * Level : 0
 * Language : Java
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120892
 */

class Solution {

    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                sb.append(cipher.charAt(i));
            }
        }

        return sb.toString();
    }
}