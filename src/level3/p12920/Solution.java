package level3.p12920;

/**
 * Author : DDing77
 * Problem Name : 선입 선출 스케줄링
 * Level : 3
 * Language : Java
 * Category : Parameter-Search
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/12920
 */

class Solution {

    public int getCount(int mid, int n, int[] cores) {
        int count = 0;
        for (int i = 0; i < cores.length; i++) {
            count += mid / cores[i] + 1;
        }

        return count;
    }

    public int solution(int n, int[] cores) {

        // Arrays.sort(cores);

        int left = 0;
        int right = 10_000 * 10_000;
        while (left + 1 < right) {
            int mid = (left + right) >> 1;
            if (getCount(mid, n, cores) >= n) {
                right = mid;
            } else {
                left = mid;
            }
        }

        int count = getCount(left, n, cores);
        for (int i = 0; i < cores.length; i++) {
            if (right % cores[i] == 0) {
                count++;
            }
            if (count == n) {
                return i + 1;
            }
        }

        return -1;
    }
}
