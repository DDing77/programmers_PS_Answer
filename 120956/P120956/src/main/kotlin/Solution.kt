class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0

        for (i in 0 until babbling.size) {
            babbling[i] = babbling[i].replaceFirst("(aya)".toRegex(), "-")
            babbling[i] = babbling[i].replaceFirst("(ye)".toRegex(), "-")
            babbling[i] = babbling[i].replaceFirst("(woo)".toRegex(), "-")
            babbling[i] = babbling[i].replaceFirst("(ma)".toRegex(), "-")
            babbling[i] = babbling[i].replace("-", "")
            if (babbling[i] == "") {
                answer++
            }
            println(babbling[i])
        }

        return answer
    }
}