package level0.p120883

/**
 * Author : DDing77
 * Problem Name: 로그인 성공?
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */

class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = "fail"

        db.map {
            if (it[0].equals(id_pw[0])) {
                if (it[1].equals(id_pw[1])) {
                    answer = "login"
                } else {
                    answer = "wrong pw"
                }
            }
        }
        return answer
    }
}