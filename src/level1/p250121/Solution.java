package level1.p250121;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Author : DDing77
 * Problem Name : [PCCE 기출문제] 10번 / 데이터 분석
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/250121
 */

class Solution {

    Map<String, Integer> extMap = new HashMap<>();

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        extMap.put("code", 0);
        extMap.put("date", 1);
        extMap.put("maximum", 2);
        extMap.put("remain", 3);

        int targetIdx = extMap.get(ext);
        int sortIdx = extMap.get(sort_by);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[sortIdx]));

        for (int[] datum : data) {
            if (datum[targetIdx] < val_ext) {
                pq.add(datum);
            }
        }

        int[][] answer = new int[pq.size()][4];
        int idx = 0;
        while (!pq.isEmpty()) {
            answer[idx++] = pq.poll();
        }

        return answer;
    }
}