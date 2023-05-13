class Solution {
    fun solution(myString: String): Array<String> {
        return myString.split("x").sorted().filter {
            !it.equals("")
        }.toTypedArray()
    }
}