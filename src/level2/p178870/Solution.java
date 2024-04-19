package level2.p178870;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 연속된 부분 수열의 합
 * Level : 2
 * Language : Java
 * Category : Two-Pointers
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/178870
 */

class Solution {

    public int[] solution(int[] sequence, int k) {

        int[] answer = new int[2];

        int left = 0;
        int right = 1;
        int sum = sequence[0];
        ArrayList<Range> answerList = new ArrayList<>();

        while (left < right) {
            if (sum > k) {
                sum -= sequence[left++];
            } else if (sum < k && right < sequence.length) {
                sum += sequence[right++];
            } else if (sum == k) {
                answerList.add(new Range(left, right - 1));
                sum -= sequence[left++];
            } else {
                break;
            }
        }

        Collections.sort(answerList);

        answer[0] = answerList.get(0).left;
        answer[1] = answerList.get(0).right;

        return answer;
    }

    static class Range implements Comparable<Range> {
        int left;
        int right;

        public Range(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int compareTo(Range o) {
            if ((right - left == o.right - o.left)) {
                return Integer.compare(left, o.left);
            }
            return Integer.compare((right - left), (o.right - o.left));
        }
    }
}