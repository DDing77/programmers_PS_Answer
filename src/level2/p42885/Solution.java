package level2.p42885;

/**
 * Author : DDing77
 * Problem Name: 구명보트
 * Level : 2
 * Language : Java
 * Category : Two-pointer
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42885
 */

import java.util.Arrays;

class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (left == right) {
                answer++;
                break;
            }

            if (people[left] + people[right] > limit) {
                answer++;
                right--;
            } else {
                answer++;
                left++;
                right--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{70, 80, 50}, 100));
    }
}