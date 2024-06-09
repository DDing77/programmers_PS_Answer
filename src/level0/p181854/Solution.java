package level0.p181854;

/**
 * Author : DDing77
 * Problem Name : 배열의 길이에 따라 다른 연산하기
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/181854
 */

class Solution {

    public int[] solution(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            arr[i] += n;
        }
        return arr;
    }
}