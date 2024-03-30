package level1.p258712;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name : 가장 많이 받은 선물
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/258712
 */

class Solution {

    public int solution(String[] friends, String[] gifts) {

        int length = friends.length;

        Map<String, Integer> friendsMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            friendsMap.put(friends[i], i);
        }

        int[][] giftBoard = new int[length][length];
        for (String gift : gifts) {
            String[] giftInfo = gift.split(" ");
            String from = giftInfo[0];
            String to = giftInfo[1];

            giftBoard[friendsMap.get(from)][friendsMap.get(to)]++;
        }

        int[][] giftStatus = new int[length][3];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                giftStatus[i][0] += giftBoard[i][j];
                giftStatus[i][1] += giftBoard[j][i];
            }
            giftStatus[i][2] = giftStatus[i][0] - giftStatus[i][1];
        }

        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (giftBoard[i][j] == giftBoard[j][i]) {
                    if (giftStatus[i][2] > giftStatus[j][2]) {
                        answer[i]++;
                    } else if (giftStatus[i][2] < giftStatus[j][2]) {
                        answer[j]++;
                    }
                } else if (giftBoard[i][j] > giftBoard[j][i]) {
                    answer[i]++;
                } else {
                    answer[j]++;
                }
            }
        }

        Arrays.sort(answer);

        return answer[length - 1];
    }
}