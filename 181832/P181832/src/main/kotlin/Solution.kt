class Solution {
    val dir = arrayOf(
        arrayOf(0, 1, 0, -1),
        arrayOf(1, 0, -1, 0)
    )

    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf()

        for (i in 0 until n) {
            answer += IntArray(n)
        }

        var cnt = 1;
        var dirIdx = 0;
        var x = 0
        var y = 0
        while (cnt <= n * n) {
            while (!(x < 0 || x >= n || y < 0 || y >= n) && answer[x][y] == 0) {
                answer[x][y] = cnt++
                x += dir[0][dirIdx]
                y += dir[1][dirIdx]
            }

            x -= dir[0][dirIdx]
            y -= dir[1][dirIdx]

            dirIdx++
            if (dirIdx % 4 == 0) {
                dirIdx = 0
            }

            x += dir[0][dirIdx]
            y += dir[1][dirIdx]
        }
        return answer
    }
}