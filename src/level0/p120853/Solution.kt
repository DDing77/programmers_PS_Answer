package level0.p120853

import java.util.*

/**
 * Author : DDing77
 * Problem Name: 컨트롤 제트
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */

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