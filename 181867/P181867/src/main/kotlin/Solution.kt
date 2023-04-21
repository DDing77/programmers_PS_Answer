class Solution {
    fun solution(myString: String) = myString.split("x").map {
        it.length
    }.toIntArray()
}