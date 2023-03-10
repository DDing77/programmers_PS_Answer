class Solution {

    fun getGCD(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        }
        return getGCD(b, a % b)
    }

    fun solution(n: Int): Int {
        return n / getGCD(n, 6)
    }
}