class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var temp = emergency.sortedArrayDescending()

        emergency.forEach {
            answer += temp.indexOf(it) + 1
        }

        return answer
    }
}