package level1.p1845;

import java.util.ArrayList;

/**
 * Author : DDing77
 * Problem Name: 폰켓몬
 * Level : 1
 * Language : Java
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */

class Solution {

    static ArrayList<Integer> monster;

    public int solution(int[] nums) {
        int answer = 0;

        monster = new ArrayList<>();
        for (int number : nums) {
            if (!monster.contains(number)) {
                monster.add(number);
            }
        }

        if (monster.size() <= nums.length / 2) {
            answer = monster.size();
        } else {
            answer = nums.length / 2;
        }

        return answer;
    }
}