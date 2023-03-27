class Solution {
    fun solution(n: Int) = (1..n).filter { it % 2 == 0 }.sum()
}