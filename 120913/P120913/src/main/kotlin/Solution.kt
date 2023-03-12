class Solution {
    fun solution(my_str: String, n: Int): ArrayList<String> {
        var answer = ArrayList<String>()

        var length = my_str.length
        var idx = 0
        for (i in 0..length - 1 step (n)) {
            if (i + n <= length) {
                answer.add(my_str.substring(i, i + n))
            } else {
                answer.add(my_str.substring(i))
            }
        }

        return answer
    }
}