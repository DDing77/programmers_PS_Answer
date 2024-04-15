package level2.p92335;

/**
 * Author : DDing77
 * Problem Name : k진수에서 소수 개수 구하기
 * Level : 2
 * Language : Java
 * Category : Math, String
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/92335
 */

class Solution {

    public boolean isPrime(long value) {

        if (value < 2) return false;

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int n, int k) {

        int answer = 0;
        StringBuilder temp = new StringBuilder();

        while (n > 0) {
            temp = temp.insert(0, n % k);
            n /= k;
        }

        String[] arr = temp.toString().split("0");

        for (String data : arr) {
            if (data.equals("")) {
                continue;
            }

            long num = Long.parseLong(data);

            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }
}
