package level1.p134240;

/**
 * Author : DDing77
 * Problem Name: 푸드 파이트 대회
 * Level : 1
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/134240?language=java
 */

public class Solution {

    public String solution(int[] food) {

        StringBuilder answer = new StringBuilder("0");

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.insert(answer.length() / 2, i);
                answer.insert(answer.length() / 2 + 1, i);
            }
        }

        return answer.toString();
    }
}
