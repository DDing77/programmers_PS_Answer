package level0.p120818;

/**
 * Author : DDing77
 * Problem Name: 옷가게 할인 받기
 * Level : 0
 * Language : Java
 * Category : Math
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */

public class Solution {

    public int solution(int price) {
        if (price >= 500_000) {
            return (int) (price * 0.8);
        } else if (price >= 300_000) {
            return (int) (price * 0.9);
        } else if (price >= 100_000) {
            return (int) (price * 0.95);
        }
        return price;
    }
}
