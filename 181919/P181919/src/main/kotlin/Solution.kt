class Solution {
    fun solution(n: Int) = mutableListOf<Int>().apply {
        add(n)

        while (last() != 1) {
            if (last() % 2 == 0) {
                add(last() / 2)
            } else {
                add(3 * last() + 1)
            }
        }
    }.toIntArray()
}