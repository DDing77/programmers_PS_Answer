package level2.p12981;

import java.util.HashSet;
import java.util.Set;

/**
 * Author : DDing77
 * Problem Name: 영어 끝말잇기
 * Level : 2
 * Language : Java
 * Category : Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */

class Solution {

    public int[] solution(int n, String[] words) {

        Set<String> hash = new HashSet<>();

        String pre = "";
        for (int i = 0; i < words.length; i++) {
            if (hash.size() == 0) {
                pre = words[i];
                hash.add(words[i]);
                continue;
            }

            if (hash.contains(words[i])) {
                System.out.println(i);
                System.out.println("test1");
                return new int[]{i % n + 1, (i + n) / n};
            }

            if (pre.charAt(pre.length() - 1) != words[i].charAt(0)) {
                System.out.println(i);
                System.out.println("test2");
                return new int[]{i % n + 1, (i + n) / n};
            }

            pre = words[i];
            hash.add(words[i]);
        }

        return new int[]{0, 0};
    }
}