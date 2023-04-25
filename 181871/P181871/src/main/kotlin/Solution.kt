class Solution {
    fun solution(myString: String, pat: String) = myString.filterIndexed { index, c ->
        index <= myString.length - pat.length && pat.equals(myString.subSequence(index, index + pat.length))
    }.count()
}