import java.util.*

class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = IntArray(num)

        var start = Math.ceil(total.toDouble() / num - Math.floor(num.toDouble() / 2)).toInt()
        for (i in 0 until num) {
            answer[i] = start + i
        }

        println(Arrays.toString(answer))
        return answer
    }
}=