class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray =
        num_list.filterIndexed { index, i -> index % n == 0 }.toIntArray()
}