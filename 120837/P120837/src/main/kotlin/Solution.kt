class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var remain = hp

        answer += remain / 5
        remain %= 5

        answer += remain / 3
        remain %= 3

        answer += remain

        return answer
    }
}