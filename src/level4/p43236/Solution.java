package level4.p43236;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 징검다리
 * Level : 4
 * Language : Java
 * Category : Binary-Search
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/43236
 */

class Solution {

    public boolean check(int mid, int[] diff, int n) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < diff.length; i++) {
            if (sum + diff[i] < mid) {
                count++;
                sum += diff[i];
            } else {
                sum = 0;
            }
        }

        if (count <= n) {
            return true;
        } else {
            return false;
        }
    }

    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);

        int[] diff = new int[rocks.length + 1];
        diff[0] = rocks[0];
        for (int i = 1; i < rocks.length; i++) {
            diff[i] = rocks[i] - rocks[i - 1];
        }
        diff[rocks.length] = distance - rocks[rocks.length - 1];

        int left = 1;
        int right = distance + 1;
        while (left + 1 < right) {
            int mid = (left + right) >> 1;
            if (check(mid, diff, n)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return left;
    }
}