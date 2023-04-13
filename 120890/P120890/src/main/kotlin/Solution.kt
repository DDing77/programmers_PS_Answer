class Solution {

    fun solution(array: IntArray, n: Int): Int {
        var idx = 0
        var minDiff = Integer.MAX_VALUE

        var sorted = array.sorted()
        for (i in sorted.indices) {
            if (Math.abs(n - sorted[i]) < minDiff) {
                minDiff = Math.abs(n - sorted[i])
                idx = i
            }
        }


        return sorted[idx]
    }
}