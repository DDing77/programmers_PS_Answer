package level3.p64062;

/**
 * Author : DDing77
 * Problem Name: 징검다리 건너기
 * Level : 3
 * Language : Java
 * Category : Binary-Search
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/64062
 */

class Solution {

    private boolean check(int[] stones, int k, int mid) {

        int count = 0;
        for (int size : stones) {
            if(size >= mid) {
                count = 0;
            } else {
                count++;
                if(count == k) {
                    return false;
                }
            }
        }

        return true;
    }

    public int solution(int[] stones, int k) {

        int left = 0;
        int right = 200_000_000;
        int mid;

        while(left < right) {
            mid = (left + right) >> 1;
            if(check(stones, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{2, 4, 5, 3, 2, 1, 4, 2, 5, 1}, 3));
    }
}