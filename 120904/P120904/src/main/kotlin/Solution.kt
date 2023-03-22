class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer = num.toString().indexOfFirst { it == k.digitToChar() }

        if (answer != -1) {
            answer++
        }

        return answer
    }
}