class Solution {
    fun getGcd(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        } else {
            return getGcd(b, a % b)
        }
    }

    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = IntArray(2)

        var gcd = getGcd(denom1, denom2)
        var lcm = denom1 / gcd * denom2
        var sum = numer1 * (lcm / denom1) + numer2 * (lcm / denom2)

        gcd = getGcd(sum, lcm)

        sum /= gcd
        lcm /= gcd

        answer[0] = sum
        answer[1] = lcm

        return answer
    }
}