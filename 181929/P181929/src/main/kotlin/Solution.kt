class Solution {
    fun solution(num_list: IntArray): Int {
        var mul = 1
        var sum = 0

        num_list.forEach {
            mul *= it
            sum += it
        }

        if (mul < sum * sum) {
            return 1
        } else {
            return 0
        }
    }
}