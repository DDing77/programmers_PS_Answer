class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var temp = n

        while (temp > 0) {
            answer += temp % 10
            temp /= 10
        }

        return answer
    }
}