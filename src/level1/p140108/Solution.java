package level1.p140108;

/**
 * Author : DDing77
 * Problem Name : 문자열 나누기
 * Level : 1
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */

class Solution {

    public int solution(String s) {

        int answer = 1;

        char x = s.charAt(0);
        int xCount = 1;
        int notXCount = 0;
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (xCount == 0) {
                x = cur;
                xCount = 1;
                answer++;
                continue;
            }

            if (cur == x) {
                xCount++;
            } else {
                notXCount++;
            }

            if (xCount == notXCount) {
                xCount = 0;
                notXCount = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("banana"));
    }
}