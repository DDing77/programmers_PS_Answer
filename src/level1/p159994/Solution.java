package level1.p159994;

/**
 * Author : DDing77
 * Problem Name: 카드 뭉치
 * Level : 1
 * Language : Java
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */

class Solution {

    static final String[] message = {
            "Yes",
            "No"
    };

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int goalIdx = 0;
        int idx1 = 0;
        int idx2 = 0;

        while (goalIdx < goal.length) {
            if (idx1 < cards1.length && goal[goalIdx].equals(cards1[idx1])) {
                idx1++;
                goalIdx++;

                continue;
            }

            if (idx2 < cards2.length && goal[goalIdx].equals(cards2[idx2])) {
                idx2++;
                goalIdx++;
                continue;
            }


            return message[1];
        }
        return message[0];
    }
}