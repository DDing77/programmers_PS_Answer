package level1.p42889;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name: 실패율
 * Level : 1
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */

class Solution {

    public int[] solution(int N, int[] stages) {

        int[] failCount = new int[N + 1];
        int[] clearCount = new int[N + 1];

        for (int stage : stages) {
            for (int j = 0; j < stage; j++) {
                clearCount[j] += 1;
            }
            failCount[stage - 1] += 1;
        }

        Map<Integer, Double> info = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (failCount[i] == 0 || clearCount[i] == 0) {
                info.put(i + 1, 0.0);
            } else {
                info.put(i + 1, (double) failCount[i] / clearCount[i]);
            }
        }

        List<Integer> list = new ArrayList<>(info.keySet());
        list.sort((o1, o2) -> Double.compare(info.get(o2), info.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(4, new int[]{4, 4, 4, 4, 4})));
    }
}