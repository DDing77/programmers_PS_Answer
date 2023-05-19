class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in flag.indices) {
            if (flag[i]) {
                repeat(arr[i] * 2) {
                    answer += arr[i]
                }
            } else {
                answer = answer.copyOfRange(0, answer.size - arr[i])
            }
        }
        return answer
    }
}