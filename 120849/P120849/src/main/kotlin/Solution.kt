class Solution {
    fun solution(my_string: String): String {
        var sb = StringBuilder()

        for (i in my_string.indices) {
            var cur = my_string.get(i)
            if (cur != 'a' && cur != 'e' && cur != 'i' && cur != 'o' && cur != 'u') {
                sb.append(cur)
            }
        }
        return sb.toString()
    }
}