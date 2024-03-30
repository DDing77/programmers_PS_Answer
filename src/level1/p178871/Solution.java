package level1.p178871;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 달리기 경주
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */

class Solution {

    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String back : callings) {
            int backIdx = playerMap.get(back);

            String front = players[backIdx - 1];
            playerMap.put(front, backIdx);
            playerMap.put(back, backIdx - 1);

            players[backIdx - 1] = back;
            players[backIdx] = front;
        }


        return players;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));
    }
}