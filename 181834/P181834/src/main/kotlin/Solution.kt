class Solution {
    fun solution(myString: String) = myString.replace("[a-k]".toRegex(), "l")
}