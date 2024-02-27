package level0.p181841;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Author : DDing77
 * Problem Name: 꼬리 문자열
 * Level : 0
 * Language : Java
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181841
 */

class Solution {

    public String solution(String[] str_list, String ex) {

        return Arrays.stream(str_list).
                filter(str -> !str.contains(ex))
                .collect(Collectors.joining());
    }
}