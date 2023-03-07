class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        var temp:String = A

        for(i in A) {
            if(temp.equals(B)) {
                return answer
            }
            answer++
            temp = temp.last() + temp.substring(0, temp.lastIndex)
        }

        return -1
    }
}