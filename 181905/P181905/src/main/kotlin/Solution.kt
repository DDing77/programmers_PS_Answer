class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string

        queries.forEach {
            answer = answer.substring(0, it[0]) +
                    answer.substring(it[0]..it[1]).reversed() +
                    answer.substring(it[1] + 1)
        }

        return answer
    }
}