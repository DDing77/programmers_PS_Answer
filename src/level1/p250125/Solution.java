package level1.p250125;

/**
 * Author : DDing77
 * Problem Name : [PCCE 기출문제] 9번 / 이웃한 칸
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/250125
 */

class Solution {

    public int solution(String[][] board, int h, int w) {

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        int answer = 0;

        for(int i = 0; i < dir.length; i++) {
            int nH = h + dir[i][0];
            int nW = w + dir[i][1];

            if(nH < 0 || nH >= board.length || nW < 0 || nW >= board.length) {
                continue;
            }

            if(board[nH][nW].equals(board[h][w])) {
                answer++;
            }
        }
        return answer;
    }
}