class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (str in s1) {
            if (s2.contains(str)) {
                answer++
            }
        }
        return answer
    }
}