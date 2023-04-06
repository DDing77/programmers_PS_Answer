class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var lineA: Double = (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]).toDouble()
        var lineB: Double = (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]).toDouble()

        if (lineA == lineB) {
            return 1
        }

        lineA = (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]).toDouble()
        lineB = (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]).toDouble()

        if (lineA == lineB) {
            return 1
        }

        return 0
    }
}