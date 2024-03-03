package level2.p70129;

import java.util.stream.Collectors;

/**
 * Author : DDing77
 * Problem Name: 이진 변환 반복하기
 * Level : 2
 * Language : Java
 * Category : String, Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */

public class Solution {

    public int[] solution(String s) {

        int deleteOne = 0;
        int changeCnt = 0;

        while (!s.equals("1")) {
            int preLength = s.length();
            s = s.chars().filter(i -> (char) i == '1')
                    .mapToObj(i -> String.valueOf((char) i))
                    .collect(Collectors.joining());

            deleteOne += preLength - s.length();

            s = Integer.toBinaryString(s.length());
            changeCnt++;
        }

        return new int[]{changeCnt, deleteOne};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("1111111");
    }
}
