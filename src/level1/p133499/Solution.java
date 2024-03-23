package level1.p133499;

/**
 * Author : DDing77
 * Problem Name : 옹알이 (2)
 * Level : 1
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */

class Solution {

    public int solution(String[] babbling) {

        int answer = 0;

        for (String s : babbling) {
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            s = s.replaceAll("aya|ye|woo|ma", "");
            if (s.equals(""))
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new String[]{"ayayemaaya"}));
    }
}