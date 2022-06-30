import java.util.*;

class Solution {

    static int cnt;
    static ArrayList<Integer> groups;
    static int[][] map;
    static int row, col;
    static boolean[][] isVisted;
    static int[] dirX = {-1, 1, 0 ,0};
    static int[] dirY = {0, 0, -1 ,1};

    static void DFS(int x, int y, int value) {
        int curX = x;
        int curY = y;
        cnt++;
        for(int k=0; k<4; k++) {
            int newX = curX + dirX[k];
            int newY = curY + dirY[k];

            if(newX <0 || newY <0 || newX >= row || newY >= col) continue;
            if(isVisted[newX][newY]) continue;
            if(value != map[newX][newY]) continue;

            isVisted[newX][newY] = true;
            DFS(newX, newY, value);
        }
    }

    public int[] solution(int m, int n, int[][] picture) {

        map = picture;
        row = m;
        col = n;
        isVisted = new boolean[m][n];
        groups = new ArrayList<>();

        for(int i=0;i<m; i++) {
            for(int j=0; j<n; j++) {
                if(picture[i][j] == 0) continue;
                if(isVisted[i][j]) continue;
                isVisted[i][j] = true;
                cnt = 0;
                DFS(i, j, map[i][j]);
                groups.add(cnt);
            }
        }



        int numberOfArea = groups.size();
        Collections.sort(groups);
        int maxSizeOfOneArea = groups.get(groups.size() -1);

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}