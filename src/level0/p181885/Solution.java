package level0.p181885;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 할 일 목록
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */

class Solution {

    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> notFinished = new LinkedList<>();
        for (int i = 0; i < finished.length; i++) {
            if (finished[i]) {
                continue;
            }
            notFinished.add(todo_list[i]);
        }

        String[] answer = new String[notFinished.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = notFinished.get(i);
        }
        return answer;
    }
}