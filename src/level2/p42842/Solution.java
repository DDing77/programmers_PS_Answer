package level2.p42842;

/**
 * Author : DDing77
 * Problem Name: 카펫
 * Level : 2
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */

class Solution {

    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int row = i;
                int col = yellow / i;

                if (brown == (row + 2) * 2 + col * 2) {
                    answer[0] = row + 2;
                    answer[1] = col + 2;
                    break;
                }
            }
        }

        if (answer[0] < answer[1]) {
            int temp = answer[0];
            answer[0] = answer[1];
            answer[1] = temp;
        }

        return answer;
    }
}
