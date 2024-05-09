package level2.p176962;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 과제 진행하기
 * Level : 2
 * Language : Java
 * Category : Greedy, Sort
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/176962
 */

class Solution {

    public String[] solution(String[][] plans) {
        Arrays.sort(plans, Comparator.comparing(o -> o[1]));

        int answerIdx = 0;
        String[] answer = new String[plans.length];

        Stack<Plan> delayStack = new Stack<>();
        Plan prePlan = null;
        Plan curPlan = null;

        for (String[] plan : plans) {
            curPlan = new Plan(plan);

            if (prePlan != null) {
                int diffTime = prePlan.getCompleteTime() - curPlan.startTime;
                if (diffTime <= 0) {
                    answer[answerIdx++] = prePlan.name;
                    while (!delayStack.isEmpty()) {
                        delayStack.peek().startTime = prePlan.getCompleteTime();
                        diffTime = delayStack.peek().getCompleteTime() - curPlan.startTime;
                        if (diffTime > 0) {
                            delayStack.peek().playTime = diffTime;
                            break;
                        } else {
                            prePlan = delayStack.pop();
                            answer[answerIdx++] = prePlan.name;
                        }
                    }
                } else {
                    prePlan.playTime = diffTime;
                    delayStack.push(prePlan);
                }
            }

            prePlan = curPlan;
        }

        answer[answerIdx++] = prePlan.name;

        while (!delayStack.isEmpty()) {
            answer[answerIdx++] = delayStack.pop().name;
        }

        return answer;
    }

    static class Plan {
        String name;
        int startTime;
        int playTime;

        public Plan(String[] planInfo) {
            this.name = planInfo[0];
            this.startTime = convertStartTimeToInt(planInfo[1]);
            this.playTime = convertPlayTimeToInt(planInfo[2]);
        }

        public int convertStartTimeToInt(String startTime) {
            String[] timeData = startTime.split(":");
            return Integer.parseInt(timeData[0]) * 60 + Integer.parseInt(timeData[1]);
        }

        public int convertPlayTimeToInt(String playTime) {
            return Integer.parseInt(playTime);
        }

        public int getCompleteTime() {
            return this.startTime + this.playTime;
        }
    }
}