package level2.p77885;

/**
 * Author : DDing77
 * Problem Name : 2개 이하로 다른 비트
 * Level : 2
 * Language : Java
 * Category : String, Bit
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/77885
 */

class Solution {

    public long[] solution(long[] numbers) {

        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
            } else {
                StringBuilder numberStr = new StringBuilder(Long.toBinaryString(numbers[i]));
                numberStr.insert(0, '0');
                for (int j = numberStr.length() - 2; j >= 0; j--) {
                    if (numberStr.charAt(j) == '0') {
                        numberStr.setCharAt(j, '1');
                        numberStr.setCharAt(j + 1, '0');
                        break;
                    }
                }
                answer[i] = Long.parseLong(numberStr.toString(), 2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new long[]{2, 7}));
    }
}