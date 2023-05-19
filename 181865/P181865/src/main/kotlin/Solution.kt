class Solution {
    fun solution(binomial: String) = binomial.split(" ").let {
        if (it[1] == "+") {
            it[0].toInt() + it[2].toInt();
        } else if (it[1] == "-") {
            it[0].toInt() - it[2].toInt();
        } else {
            it[0].toInt() * it[2].toInt();
        }
    }
}