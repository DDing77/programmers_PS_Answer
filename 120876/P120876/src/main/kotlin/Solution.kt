class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        var res = IntArray(202)
        for (i in lines.indices) {
            var left = lines.get(i)[0]
            var right = lines.get(i)[1]

            for (i in left + 1..right) {
                res[i + 100]++
            }
        }

        for (i in res.indices) {
            if (res[i] > 1) {
                answer++
            }
        }

        return answer
    }
}