class Solution {
    fun solution(my_string: String): IntArray {
        var answer = mutableListOf<Int>()

        my_string.map {
            if (Character.isDigit(it)) {
                answer.add(it.digitToInt())
            }
        }

        return answer.sorted().toIntArray()
    }
}