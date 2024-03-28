package level1.p64061;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 크레인 인형뽑기 게임
 * Level : 1
 * Language : Java
 * Category : Stack
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */

class Solution {

    public int solution(int[][] board, int[] moves) {

        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        Stack<Integer>[] colLine = new Stack[col];
        for (int i = 0; i < col; i++) {
            colLine[i] = new Stack<>();
            for (int j = row - 1; j >= 0; j--) {
                int value = board[j][i];
                if (value != 0) {
                    colLine[i].add(value);
                }
            }
        }

        Stack<Integer> outDollStack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int targetCol = moves[i] - 1;
            if (colLine[targetCol].size() == 0) {
                continue;
            }

            int targetDoll = colLine[targetCol].pop();

            if (outDollStack.size() == 0 || outDollStack.peek() != targetDoll) {
                outDollStack.add(targetDoll);
            } else {
                answer += 2;
                outDollStack.pop();
            }
        }
        return answer;
    }
}