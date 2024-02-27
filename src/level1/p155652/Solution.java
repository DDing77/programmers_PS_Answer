package level1.p155652;

/**
 * Author : DDing77
 * Problem Name: 둘만의 암호
 * Level : 1
 * Language : Java
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/155652
 */

class Solution {

    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int cnt = 0;

            while (cnt < index) {
                ch += 1;

                if (ch > 'z') {
                    ch = 'a';
                }

                if (!skip.contains(Character.toString(ch))) {
                    cnt++;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}