package level1.p133502;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 햄버거 만들기
 * Level : 1
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */

class Solution {

    public int solution(int[] ingredient) {

        int answer = 0;
        Stack<Integer> hambuger = new Stack<>();

        for (int in : ingredient) {
            hambuger.add(in);

            int size = hambuger.size();
            if (size >= 4) {
                if (hambuger.get(size - 4) == 1
                        && hambuger.get(size - 3) == 2
                        && hambuger.get(size - 2) == 3
                        && hambuger.get(size - 1) == 1) {
                    answer++;
                    for (int i = 0; i < 4; i++) {
                        hambuger.pop();
                    }
                }
            }
        }
        return answer;
    }
}