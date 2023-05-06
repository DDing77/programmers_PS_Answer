class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        queries.forEach {
            var min = Integer.MAX_VALUE
            var flag = false
            for (i in it[0]..it[1]) {
                if (arr[i] > it[2]) {
                    flag = true
                    min = Math.min(min, arr[i])
                }
            }

            if (!flag) {
                answer += -1
            } else {
                answer += min
            }
        }

        return answer
    }
}