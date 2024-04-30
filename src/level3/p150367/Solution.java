package level3.p150367;

/**
 * Author : DDing77
 * Problem Name : 표현 가능한 이진트리
 * Level : 3
 * Language : Java
 * Category : Divide-Conquer
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/150367
 */

class Solution {

    private boolean check(int left, int right, String bit) {
        if (left >= right) {
            return true;
        }

        int mid = (left + right) >> 1;
        if (bit.charAt(mid) == '0') {
            for (int i = left; i <= right; i++) {
                if (bit.charAt(i) == '1') {
                    return false;
                }
            }
        }

        return check(left, mid - 1, bit) && check(mid + 1, right, bit);
    }

    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];

        int idx = 0;
        for (long number : numbers) {

            if (number == 0L) {
                answer[idx++] = 0;
                continue;
            }

            StringBuilder bit = new StringBuilder(Long.toBinaryString(number));
            int length = bit.length();

            int k = 1;
            while ((int) Math.pow(2, k) - 1 < length) {
                k++;
            }

            for (int i = 1; i <= (int) Math.pow(2, k) - 1 - length; i++) {
                bit.insert(0, "0");
            }
            if (check(0, bit.length() - 1, bit.toString())) {
                answer[idx++] = 1;
            } else {
                answer[idx++] = 0;
            }
        }
        return answer;
    }
}