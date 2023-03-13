import java.util.StringTokenizer

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var st: StringTokenizer = StringTokenizer(s)

        var pre: String = ""
        while (st.hasMoreTokens()) {
            var cur = st.nextToken()
            if (cur.equals("Z")) {
                answer -= pre.toInt()
                continue
            }

            answer += cur.toInt()
            pre = cur
        }
        return answer
    }
}