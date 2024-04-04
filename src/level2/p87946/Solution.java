package level2.p87946;

/**
 * Author : DDing77
 * Problem Name : 피로도
 * Level : 2
 * Language : Java
 * Category : Back-Tracking
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */

class Solution {

    public int answer = 0;

    public void execDFS(int depth, int remain, boolean[] isVisited, int[][] dungeons) {

        answer = Math.max(answer, depth);

        for (int i = 0; i < isVisited.length; i++) {
            if (!isVisited[i] && remain >= dungeons[i][0]) {
                isVisited[i] = true;
                execDFS(depth + 1, remain - dungeons[i][1], isVisited, dungeons);
                isVisited[i] = false;
            }
        }
    }

    public int solution(int k, int[][] dungeons) {

        boolean[] isVisited = new boolean[dungeons.length];

        execDFS(0, k, isVisited, dungeons);

        return answer;
    }
}