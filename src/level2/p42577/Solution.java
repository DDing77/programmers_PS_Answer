package level2.p42577;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 전화번호 목록
 * Level : 2
 * Language : Java
 * Category : Sort
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */

class Solution {

    public boolean solution(String[] phone_book) {

        boolean answer = true;

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }
}