class Solution {
    fun solution(array: IntArray): Int {
        var answer = array.sorted()[array.size / 2]
        return answer
    }
}