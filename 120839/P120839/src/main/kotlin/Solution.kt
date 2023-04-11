class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""

        rsp.map {
            if (it == '0') {
                answer += "5"
            } else if (it == '2') {
                answer += "0"
            } else {
                answer += "2";
            }
        }

        return answer
    }
}