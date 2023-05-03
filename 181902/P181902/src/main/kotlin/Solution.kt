class Solution {
    fun solution(my_string: String): IntArray {
        var answer = IntArray(52)

        my_string.forEach {
            if (it.isUpperCase()) {
                answer[it.toInt() - 65]++
            } else {
                answer[it.toInt() - 71]++
            }
        }

        return answer
    }
}