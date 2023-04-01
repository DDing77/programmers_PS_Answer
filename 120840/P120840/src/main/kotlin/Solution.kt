class Solution {

    fun combination(n: Int, r: Int): Int {
        if (n == r || r == 0) {
            return 1
        }

        return combination(n - 1, r - 1) + combination(n - 1, r)
    }

    fun solution(balls: Int, share: Int): Int {
        return combination(balls, share)
    }
}