class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = IntArray(2)
        answer[0] = money / 5500
        answer[1] = money % 5500
        return answer
    }
}