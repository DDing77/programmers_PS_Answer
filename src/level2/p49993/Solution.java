package level2.p49993;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 스킬트리
 * Level : 2
 * Language : Java
 * Category : Hash, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/49993
 */

class Solution {

    public int solution(String skill, String[] skill_trees) {

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < skill.length(); i++) {
            set.add(skill.charAt(i));
        }

        int answer = 0;
        for (String str : skill_trees) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (set.contains(ch)) {
                    sb.append(ch);
                }
            }

            if (skill.startsWith(sb.toString())) {
                answer++;
            }
        }

        return answer;
    }
}