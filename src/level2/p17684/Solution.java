package level2.p17684;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : [3차] 압축
 * Level : 2
 * Language : Java
 * Category : Hash, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/17684
 */

class Solution {

    public HashMap<String, Integer> index;

    private void initIndex() {
        for (int i = 0; i < 26; i++) {
            index.put(String.valueOf((char) (i + 'A')), i + 1);
        }
    }

    public int[] solution(String msg) {
        index = new HashMap<>();
        initIndex();

        int left = 0;
        int length = msg.length();
        ArrayList<Integer> answer = new ArrayList<>();

        while (left < length) {
            if (left == length - 1) {
                answer.add(index.get(msg.substring(left, left + 1)));
                break;
            }

            int right = left + 1;
            while (right < length && index.containsKey(msg.substring(left, right))) {
                right++;
            }

            if (right == length && index.containsKey(msg.substring(left, right))) {
                answer.add(index.get(msg.substring(left, right)));
                break;
            } else {
                answer.add(index.get(msg.substring(left, right - 1)));
                index.put(msg.substring(left, right), index.size() + 1);
            }

            left = right - 1;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("KAKAO"));
    }
}