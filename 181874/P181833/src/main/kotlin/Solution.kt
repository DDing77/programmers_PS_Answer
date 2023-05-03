class Solution {
    fun solution(n: Int): Array<IntArray> = Array(n) { i ->
        IntArray(n) { j ->
            if (i == j) 1 else 0
        }
    }
}