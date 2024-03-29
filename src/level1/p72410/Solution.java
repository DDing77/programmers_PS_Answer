package level1.p72410;

/**
 * Author : DDing77
 * Problem Name : 신규 아이디 추천
 * Level : 1
 * Language : Java
 * Category : Implementation, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/72410
 */

class Solution {

    public String solution(String new_id) {

        String answer = new_id;

        //1
        answer = answer.toLowerCase();
        //2
        answer = answer.replaceAll("[^a-z0-9-_\\.]", "");
        //3
        answer = answer.replaceAll("\\.{2,}", ".");
        //4
        answer = answer.replaceAll("(^\\.|\\.$)", "");
        //5
        if (answer.length() == 0) {
            answer = "a";
        }
        //6
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");
        }
        //7
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("abcdefghijklmn.p"));
    }
}