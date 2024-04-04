package level2.p42839;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 소수 찾기
 * Level : 2
 * Language : Java
 * Category : Math, Back-Tracking
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */

class Solution {

    public boolean[] isNotPrime = new boolean[10000000];
    public boolean[] isVisited;
    public Set<Integer> primes = new HashSet<>();

    public int comb(int temp, boolean[] isVisited, String numbers) {

        int count = 0;

        if (!isNotPrime[temp] && !primes.contains(temp)) {
            count++;
            primes.add(temp);
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                count += comb(temp * 10 + (numbers.charAt(i) - '0'), isVisited, numbers);
                isVisited[i] = false;
            }
        }

        return count;
    }

    public int solution(String numbers) {

        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
            if (!isNotPrime[i]) {
                for (int j = i * 2; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        isVisited = new boolean[10000000];
        return comb(0, isVisited, numbers);
    }
}