package level3.p77486;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Author : DDing77
 * Problem Name : 다단계 칫솔 판매
 * Level : 3
 * Language : Java
 * Category : DFS
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/77486
 */

class Solution {

    HashMap<String, String> edges;
    HashMap<String, Integer> revenue;

    private void execDFS(String curPerson, int money) {
        if (curPerson.equals("-") || money == 0) {
            return;
        }

        int charge = money / 10;
        int myRevenue = money - charge;

        revenue.put(curPerson, revenue.get(curPerson) + myRevenue);
        execDFS(edges.get(curPerson), charge);
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        edges = new HashMap<>();
        revenue = new HashMap<>();
        for (int i = 0; i < referral.length; i++) {
            edges.put(enroll[i], referral[i]);
            revenue.put(enroll[i], 0);
        }

        for (int i = 0; i < seller.length; i++) {
            execDFS(seller[i], amount[i] * 100);
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = revenue.get(enroll[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(
                new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
                new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[]{"sam", "emily", "jaimie", "edward"},
                new int[]{2, 3, 5, 4})));
    }
}