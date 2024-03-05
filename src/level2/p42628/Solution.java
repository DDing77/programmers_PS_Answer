package level2.p42628;

import java.util.Arrays;
import java.util.TreeMap;


/**
 * Author : DDing77
 * Problem Name: 이중우선순위큐
 * Level : 2
 * Language : Java
 * Category : TreeMap, PriorityQueue
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42628
 */

class Solution {

    public int[] solution(String[] operations) {

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (String operation : operations) {
            String[] op = operation.split(" ");
            int number = Integer.parseInt(op[1]);

            if (op[0].equals("I")) {
                tm.put(number, tm.getOrDefault(number, 0) + 1);
            } else {
                if (tm.size() == 0) {
                    continue;
                }

                if (number == 1) {
                    int maxKey = tm.lastKey();
                    if (tm.get(maxKey) == 1) {
                        tm.remove(maxKey);
                    } else {
                        tm.put(maxKey, tm.get(maxKey) - 1);
                    }
                } else {
                    int minKey = tm.firstKey();
                    if (tm.get(minKey) == 1) {
                        tm.remove(minKey);
                    } else {
                        tm.put(minKey, tm.get(minKey) - 1);
                    }
                }
            }
        }

        if (tm.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{tm.lastKey(), tm.firstKey()};
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(
                Arrays.toString(test.solution(new String[]{"I 1", "I 2", "D 1", "D -1", "I 3", "I 4", "D 1"})));
    }
}