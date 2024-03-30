package level1.p250137;

/**
 * Author : DDing77
 * Problem Name : [PCCP 기출문제] 1번 / 붕대 감기
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/250137
 */

class Solution {

    public int solution(int[] bandage, int health, int[][] attacks) {

        int curHealth = health;
        for (int i = 0; i < attacks.length; i++) {
            if (i != 0) {
                int diff = attacks[i][0] - attacks[i - 1][0] - 1;
                curHealth = Math.min(health, curHealth + diff * bandage[1] + bandage[2] * (diff / bandage[0]));
            }
            curHealth -= attacks[i][1];

            System.out.println("curHealth = " + curHealth);
            if (curHealth <= 0) {
                curHealth = -1;
                break;
            }
        }

        return curHealth;
    }
}