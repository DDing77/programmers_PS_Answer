class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        queries.map {
            var temp = arr[it[0]];
            arr[it[0]] = arr[it[1]];
            arr[it[1]] = temp
        }

        return arr
    }
}