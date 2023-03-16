class Solution {
    fun solution(my_string: String): String {
        var answer: String = my_string.toList().distinct().joinToString("")
        return answer
    }
}