package level1.p12939;

/**
 * Author : DDing77
 * Problem Name: 최댓값과 최솟값
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */

class Solution {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String[] numbers = s.split(" ");
        for (String number : numbers) {
            int parsedNumber = Integer.parseInt(number);
            min = Math.min(min, parsedNumber);
            max = Math.max(max, parsedNumber);
        }

        return sb.append(min).append(" ").append(max).toString();
    }
}