package level1.p12977;

/**
 * Author : DDing77
 * Problem Name: 소수 만들기
 * Level : 1
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */

class Solution {

    boolean[] prime;

    public void getPrimeTable(int[] nums) {

        prime = new boolean[3_001];

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i * 2; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }

    public int solution(int[] nums) {
        int answer = 0;

        getPrimeTable(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (!prime[nums[i] + nums[j] + nums[k]]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}