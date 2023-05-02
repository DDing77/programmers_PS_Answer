class Solution {
    fun solution(n: Int, numlist: IntArray) = numlist.filter { it >= n && it % n == 0 }
}