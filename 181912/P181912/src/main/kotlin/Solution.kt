class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()

        intStrs.forEach {
            if (it.substring(s, s + l).toInt() > k) {
                answer += it.substring(s, s + l).toInt()
            }
        }
        return answer
    }
}