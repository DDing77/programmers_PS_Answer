class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0

        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common.last() + (common[1] - common[0])
        } else {
            answer = common.last() * (common[1] / common[0])
        }
        return answer
    }
}