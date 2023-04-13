class Solution {
    fun solution(sides: IntArray): Int = sides.sort().let {
        if (sides[0] + sides[1] > sides[2]) {
            return 1
        } else {
            return 2
        }
    }
}