class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (i in my_string.indices) {
            answer += my_string.substring(i)
        }

        return answer.sortedArray()
    }
}