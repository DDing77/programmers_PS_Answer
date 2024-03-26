package level1.p42862;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 체육복
 * Level : 1
 * Language : Java
 * Category : Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42862#
 */

class Solution {

    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n;

        int[] surplus = new int[n + 1];
        Arrays.fill(surplus, 1);


        for(int idx : reserve) {
            surplus[idx]++;
        }

        for(int idx : lost) {
            surplus[idx]--;
        }

        Arrays.sort(lost);

        for(int idx : lost) {
            if(surplus[idx] != 0) {
                continue;
            }

            if(idx == 1 && surplus[idx + 1] != 2) {
                answer--;
                continue;
            }

            if(idx == 1 && surplus[idx + 1] == 2) {
                surplus[idx] = 1;
                surplus[idx + 1] = 1;
                continue;
            }

            if(idx == n && surplus[idx - 1] != 2) {
                answer--;
                continue;
            }

            if(idx == n && surplus[idx - 1] == 2) {
                surplus[idx] = 1;
                surplus[idx - 1] = 1;
                continue;
            }

            if(surplus[idx - 1] == 2) {
                surplus[idx - 1] = 1;
                surplus[idx] = 1;
            } else if(surplus[idx + 1] == 2){
                surplus[idx + 1] = 1;
                surplus[idx] = 1;
            } else {
                answer--;
            }
        }

        return answer;
    }
}