import java.util.*

class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        return my_string.toList().let {
            Collections.swap(it, num1, num2)
            it.joinToString { "" }
        }
    }
}