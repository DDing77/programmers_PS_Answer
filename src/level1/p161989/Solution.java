package level1.p161989;

/**
 * Author : DDing77
 * Problem Name: 덧칠하기
 * Level : 1
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */

class Solution {

    public int solution(int n, int m, int[] section) {

        int answer = 0;

        int idx = 0;
        int right = section[0] + m - 1;

        while (true) {
            answer++;
            while (idx < section.length && section[idx] <= right) {
                idx++;
                if (idx == section.length) {
                    return answer;
                }
            }

            if (section[idx] + m - 1 > n) {
                right = n;
            } else {
                right = section[idx] + m - 1;
            }

        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(8, 4, new int[]{2, 3, 6}));
    }
}