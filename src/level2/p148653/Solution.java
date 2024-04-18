package level2.p148653;

/**
 * Author : DDing77
 * Problem Name : 마법의 엘리베이터
 * Level : 2
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/148653
 */

class Solution {

    public int solution(int storey) {
        String storeyToInt = Integer.toString(storey);

        int[] number = new int[storeyToInt.length()];
        for (int i = 0; i < storeyToInt.length(); i++) {
            number[i] = storeyToInt.charAt(i) - '0';
        }

        int answer = 0;
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] > 5) {
                answer += 10 - number[i];

                if (i == 0)  {
                    answer++;
                } else {
                    number[i - 1]++;
                }
            } else if (number[i] == 5 && i > 0 && number[i - 1] >= 5) {
                number[i - 1]++;
                answer += 5;
            } else {
                answer += number[i];
            }
        }

        return answer;
    }
}