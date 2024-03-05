package level2.p12953;

import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name: N개의 최소공배수
 * Level : 2
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */

class Solution {

    public int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }

    public int solution(int[] arr) {
        return IntStream.range(0, arr.length)
                .reduce(1, (accumulator, i) -> (accumulator * arr[i]) / getGCD(accumulator, arr[i]));
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{2,6,8,14}));
    }
}