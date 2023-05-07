class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var first: String = my_string.substring(0, s);
        var end = my_string.substring(s + overwrite_string.length)
        return first + overwrite_string + end
    }
}
