import java.lang.StringBuilder

class Solution {
    fun solution(my_string: String): String {
        var sb: java.lang.StringBuilder = StringBuilder()

        for (i: Int in my_string.indices step (1)) {
            var ch: Char = my_string[i]
            if (ch in 'a'..'z') {
                sb.append(ch.uppercaseChar())
            } else {
                sb.append(ch.lowercaseChar())
            }
        }
        return sb.toString()
    }
}