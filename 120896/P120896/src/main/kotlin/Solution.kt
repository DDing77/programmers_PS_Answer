import java.util.*

class Solution {
    var alpha: IntArray = IntArray(26, { 0 })

    fun solution(s: String): String {
        var sb = StringBuilder();

        for (i: Char in s) {
            alpha[i - 'a']++;
        }

        println(Arrays.toString(alpha))

        for (i: Int in alpha.indices) {
            if (alpha[i] == 1) {
                sb.append((i + 'a'.code).toChar());
            }
        }
        return sb.toString();
    }
}