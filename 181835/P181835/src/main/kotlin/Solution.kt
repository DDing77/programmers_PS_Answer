class Solution {
    fun solution(arr: IntArray, k: Int) = arr.map { if (k % 2 == 1) it * k else it + k }
}