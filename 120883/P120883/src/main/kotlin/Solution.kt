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