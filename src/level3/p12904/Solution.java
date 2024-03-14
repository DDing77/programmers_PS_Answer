package level3.p12904;

/**
 * Author : DDing77
 * Problem Name: 가장 긴 팰린드롬
 * Level : 3
 * Language : Java
 * Category : String, Sliding-Window
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12904
 */

class Solution {

    public int solution(String s) {

        int answer = 1;
        int length = s.length();

        for (int i = length; i >= 1; i--) {
            for (int j = 0; j <= length - i; j++) {
                int left = j;
                int right = j + i - 1;

                boolean isPalindrome = true;
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome) {
                    return i;
                }
            }
        }

        return answer;
    }
}