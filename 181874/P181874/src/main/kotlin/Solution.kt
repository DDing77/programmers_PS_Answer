class Solution {
    fun solution(myString: String): String {
        var answer = StringBuilder(myString.lowercase())

        answer.forEachIndexed { index, c ->
            if (c == 'a') {
                answer[index] = 'A'
            }
        }
        return answer.toString()
    }
}