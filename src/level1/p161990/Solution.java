package level1.p161990;

/**
 * Author : DDing77
 * Problem Name : 바탕화면 정리
 * Level : 1
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/161990
 */

class Solution {

    public int[] solution(String[] wallpaper) {

        int[] answer = new int[4];

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j <wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i + 1);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j + 1);
                }
            }
        }

        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX;
        answer[3] = maxY;
        return answer;
    }
}