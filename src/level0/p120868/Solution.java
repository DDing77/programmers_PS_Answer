package level0.p120868;

/**
 * Author : DDing77
 * Problem Name: 삼각형의 완성조건 (2)
 * Level : 0
 * Language : Java
 * Category : Geometry
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120868
 */

class Solution {

    public int solution(int[] sides) {

        int inputMin = Math.min(sides[0], sides[1]);
        int inputMax = Math.max(sides[0], sides[1]);

        int answer = 0;

        answer += (inputMax + inputMin) - inputMax - 1;
        answer += (inputMax + 1) - (inputMax - inputMin + 1);
        return answer;
    }
}