class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in k..n step k) {
            answer += i;
        }
        return answer
    }
}