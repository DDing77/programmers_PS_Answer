package level3.p43164;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author : DDing77
 * Problem Name: 여행경로
 * Level : 3
 * Language : Java
 * Category : DFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/43164
 */

class Solution {

    public String[] solution(String[][] tickets) {

        Map<String, ArrayList<String>> ticket = new HashMap<>();
        for (String[] strings : tickets) {
            ticket.computeIfAbsent(strings[0], key -> new ArrayList<String>()).add(strings[1]);
        }

        for (String s : ticket.keySet()) {
            ticket.get(s).sort(String::compareTo);
        }

        List<String> answer = new ArrayList<>();

        int idx = 0;
        answer.add("ICN");
        String pre = "ICN";
        while (idx < tickets.length) {
            if(ticket.get(pre).size() == 0) {
                break;
            }
            String next = ticket.get(pre).remove(0);
            answer.add(next);
            pre = next;
            idx++;
        }
        return answer.stream().toArray(String[]::new);
    }
}