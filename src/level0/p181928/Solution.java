package level0.p181928;

/**
 * Author : DDing77
 * Problem Name : 이어 붙인 수
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */

class Solution {

    public int solution(int[] num_list) {

        int odd = 0;
        int even = 0;
        for (int ele : num_list) {
            if (ele % 2 == 0) {
                even *= 10;
                even += ele;
            } else {
                odd *= 10;
                odd += ele;
            }
        }

        return odd + even;
    }
}