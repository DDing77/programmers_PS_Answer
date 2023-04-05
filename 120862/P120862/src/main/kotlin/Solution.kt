class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        return (numbers[0] * numbers[1]).coerceAtLeast(numbers[numbers.size - 1] * numbers[numbers.size - 2])
    }
}