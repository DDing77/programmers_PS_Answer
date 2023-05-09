class Solution {
    fun solution(myString: String, pat: String): String =
        Regex("[a-zA-Z]*$pat").find(myString)?.value ?: ""
}