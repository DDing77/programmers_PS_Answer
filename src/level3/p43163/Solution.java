package level3.p43163;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * Author : DDing77
 * Problem Name: 단어 변환
 * Level : 3
 * Language : Java
 * Category : BFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/43163
 */

class Solution {

    public boolean isOneCharDiffer(String a, String b) {

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }

        if (count == 1) {
            return true;
        }

        return false;
    }

    public int solution(String begin, String target, String[] words) {

        int answer = 0;
        Set<String> pre = new HashSet<>();
        Queue<Info> que = new ArrayDeque<>();
        que.add(new Info(begin, 0));
        pre.add(begin);

        while (!que.isEmpty()) {
            Info cur = que.poll();
            if (cur.changedWord.equals(target)) {
                return cur.time;
            }

            for (String next : words) {
                if (pre.contains(next)) {
                    continue;
                }

                if (isOneCharDiffer(cur.changedWord, next)) {
                    pre.add(next);
                    que.add(new Info(next, cur.time + 1));
                }
            }
        }

        return answer;
    }

    static class Info {

        String changedWord;
        int time;

        public Info(String changedWord, int time) {
            this.changedWord = changedWord;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
    }
}