package level1.p12921;

/**
 * Author : DDing77
 * Problem Name: 소수 찾기
 * Level : 1
 * Language : Java
 * Category : Math
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/12921
 */

class Solution {
    boolean[] primes;

    public void getPrime(int n) {
        primes = new boolean[n + 1];

        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
    }

    public int solution(int n) {
        int answer = 0;

        getPrime(n);

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                answer++;
            }
        }

        return answer;
    }
}