class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var minX = Integer.MAX_VALUE
        var maxX = Integer.MIN_VALUE
        var minY = Integer.MAX_VALUE
        var maxY = Integer.MIN_VALUE

        for (i in dots.indices) {
            minX = Math.min(minX, dots[i][0])
            minY = Math.min(minY, dots[i][1])
            maxX = Math.max(maxX, dots[i][0])
            maxY = Math.max(maxY, dots[i][1])
        }

        answer = (maxX - minX) * (maxY - minY)

        return answer
    }
}