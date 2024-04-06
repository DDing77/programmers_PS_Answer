package level2.p64065;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Author : DDing77
 * Problem Name : 튜플
 * Level : 2
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/64065
 */

class Solution {

    public int[] solution(String s) {


        String[] tuples = s.split("\\},\\{");
        tuples[0] = tuples[0].replaceAll("\\{\\{", "");
        tuples[tuples.length - 1] = tuples[tuples.length - 1].replaceAll("\\}\\}", "");


        Arrays.sort(tuples, Comparator.comparingInt(String::length));

        int[] answer = new int[tuples.length];

        int idx = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < tuples.length; i++) {
            String[] temp = tuples[i].split(",");
            for (int j = 0; j < temp.length; j++) {
                if (!set.contains(temp[j])) {
                    answer[idx++] = Integer.parseInt(temp[j]);
                    set.add(temp[j]);
                }
            }
        }
        return answer;
    }
}
