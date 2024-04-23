package level3.p77886;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 110 옮기기
 * Level : 3
 * Language : Java
 * Category : String, Greedy
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/77886
 */

class Solution {

    public String[] solution(String[] s) {
        String[] answer = new String[s.length];
        int answerIdx = 0;
        for (int i = 0; i < s.length; i++) {
            StringBuilder remain = new StringBuilder();
            int count = 0;
            for (int j = 0; j < s[i].length(); j++) {
                remain.append(s[i].charAt(j));
                if (remain.length() >= 3 && remain.substring(remain.length() - 3).equals("110")) {
                    count++;
                    remain.delete(remain.length() - 3, remain.length());
                }
            }

            int idx = -1;
            for (int j = remain.length() - 1; j >= 0; j--) {
                if (remain.charAt(j) == '0') {
                    idx = j + 1;
                    break;
                }
            }

            if (idx == -1) {
                while (count-- > 0) {
                    remain.insert(0, "110");
                }
            } else {
                while (count-- > 0) {
                    remain.insert(idx, "110");
                }
            }


            answer[answerIdx++] = remain.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(new String[]{"1110", "100111100", "0111111010"})));
    }
}