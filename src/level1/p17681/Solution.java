package level1.p17681;

/**
 * Author : DDing77
 * Problem Name: [1차] 비밀지도
 * Level : 1
 * Language : Java
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */

class Solution {

    static StringBuilder sb;

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] temp = new String[n];

        for (int i = 0; i < n; i++) {
            temp[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            while (temp[i].length() < n) {
                temp[i] = "0" + temp[i];
            }
            sb = new StringBuilder();
            for (int j = 0; j < temp[i].length(); j++) {
                if (temp[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }


            answer[i] = sb.toString();
        }

        return answer;
    }
}
