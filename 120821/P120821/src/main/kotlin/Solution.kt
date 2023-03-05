class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = IntArray(num_list.size)
        println(answer.size)
        for (i in num_list.size - 1 downTo 0) {
            answer[num_list.size - 1 - i] = num_list[i];
        }
        return answer
    }
}