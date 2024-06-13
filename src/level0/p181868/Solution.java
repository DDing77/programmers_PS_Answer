package level0.p181868;

/**
 * Author : DDing77
 * Problem Name : 공백으로 구분하기 2
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */

class Solution {

    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split(" +");
        return answer;
    }
}